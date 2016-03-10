package com.mk.hms.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mk.hms.enums.HmsOtaOrserStatusEnum;
import com.mk.hms.exception.SessionTimeOutException;
import com.mk.hms.mapper.HmsOtsOrderMapper;
import com.mk.hms.model.EHotel;
import com.mk.hms.model.EHotelWithBLOBs;
import com.mk.hms.model.HmsOtaOrderModel;
import com.mk.hms.model.HmsOtaRoomOrderModel;
import com.mk.hms.utils.HmsDateUtils;
import com.mk.hms.utils.SessionUtils;

/**
 * hms订单信息
 * @author hdy
 */
@Service
@Transactional
public class HmsOtsOrderService{

	private static final Logger logger = LoggerFactory.getLogger(HmsOtsOrderService.class);
	
	@Autowired
	private HmsOtsOrderMapper hmsOtsOrderMapper;
	
	/**
	 * 获取订单信息
	 * @return 订单列表
	 */
	public List<HmsOtaOrderModel> findHmsOtsOrders(int pageNum, int pageSize) {
		int stateIndex = (pageNum - 1) * pageSize;
		int dataSize = pageSize;
		return hmsOtsOrderMapper.findHmsOrders(stateIndex, dataSize);
	}
	
	/**
	 * 获取订单信息
	 * @return 订单列表
	 */
	/*public List<HmsOtaOrderModel> findHmsOtsOrdersInHotel(int pageNum, int pageSize) {
		int stateIndex = (pageNum - 1) * pageSize;
		int dataSize = pageSize;
		HmsEHotelModel eHotel = SessionUtils.getThisHotel();
		return hmsOtsOrderMapper.findHmsOrdersInHotel(eHotel.getId(), stateIndex, dataSize);
	}*/
	
	/**
	 * 获取酒店今日订单
	 * @return 
	 * @throws SessionTimeOutException 
	 */
	public List<HmsOtaOrderModel> findHmsOtsOrdersToday() throws SessionTimeOutException {
		EHotel eHotel = SessionUtils.getThisHotel();
		String todayStateTime = "";
		String todayEndTime = "";
		try {
			todayStateTime = HmsDateUtils.getFormatDateString(new Date(HmsDateUtils.getTodayStateTimeVal()),
					HmsDateUtils.FORMAT_DATETIME);
			todayEndTime = HmsDateUtils.getFormatDateString(new Date(HmsDateUtils.getTodayEndTimeVal()),
					HmsDateUtils.FORMAT_DATETIME);
		} catch (ParseException e) {
			HmsOtsOrderService.logger.error("日期类型转换异常：" + e.getMessage(), e);
		}
		return hmsOtsOrderMapper.findTodayHmsOrders(eHotel.getId(), todayStateTime, todayEndTime);
	}
	
	/**
	 * 获取酒店今日已入住订单
	 * @return 
	 * @throws SessionTimeOutException 
	 */
	public List<HmsOtaOrderModel> findCheckinHmsOrders() throws SessionTimeOutException {
		EHotelWithBLOBs eHotel = SessionUtils.getThisHotel();
		return hmsOtsOrderMapper.findHmsOrdersByStatus(eHotel.getId(), HmsOtaOrserStatusEnum.Checkin.getValue());
	}
	
	/**
	 * 获取无效订单信息
	 * @return 订单列表
	 */
	public List<HmsOtaOrderModel> findHmsOrdersInvalid(int pageNum, int pageSize) {
		/*int stateIndex = (pageNum - 1) * pageSize;
		int dataSize = pageSize;
		HmsLoginUserModel loginUser = SessionUtils.getSessionLoginUser();
		String sql = "select * from b_otaroomorder where Hotelid = " + loginUser.getThisHotel().getId() 
				+ " limit " + stateIndex + ", " + dataSize
				+ " where OrderStatus ＝ 无效";
		return hmsOtsRoomOrderMapper.findHmsRoomOrders(sql);*/
		//TODO
		return null;
	}
	/**
	 * 获取订单信息
	 * @param id 订单id
	 * @return 订单信息
	 */
	public HmsOtaOrderModel findOtsOrderById(long id) {
		return hmsOtsOrderMapper.findOtsOrderByid(id);
	}
	
	/**
	 * 获取订单客单信息
	 * @param id 订单id
	 * @return 订单信息
	 */
	public HmsOtaRoomOrderModel findOtsRoomOrderById(long otsOrderId) {
		return hmsOtsOrderMapper.findOtsRoomOrderByOrderId(otsOrderId);
	}
	
	/**
	 * 获取酒店订单数据总条数
	 * @return 条数
	 * @throws SessionTimeOutException 
	 */
	public int findHmsOrdersInHotelCount() throws SessionTimeOutException {
		EHotelWithBLOBs eHotel = SessionUtils.getThisHotel();
		return hmsOtsOrderMapper.findHmsOrdersCount(eHotel.getId()).size();
	}
	
	/**
	 * 获取无效订单数据总条数
	 * @return 数据总条数
	 */
	public int findHmsOrdersInvalidCount() {
		/*HmsLoginUserModel loginUser = SessionUtils.getSessionLoginUser();
		String sql = "select count(id) from b_otaroomorder where Hotelid = " + loginUser.getThisHotel().getId() 
				+ " and OrderStatus ＝ 无效";
		return hmsOtsRoomOrderMapper.listCount(sql);*/
		//TODO
		return 0;
	}
	
	/**
	 * 根据订单id，获取订单信息
	 * @param orderIds
	 * @return
	 */
	public List<HmsOtaOrderModel> getOtaOrdersByOrders(String orderIds) {
		return hmsOtsOrderMapper.findHmsOrdersByOrderIds(orderIds);
	}
	
	/**
	 * 获取前台订单优惠券是否存在
	 * @param promotion 前台优惠券id
	 * @param otaorderid 订单id
	 * @return 是否存在前台优惠券
	 */
	public boolean isExitPromotionInOtsOrder(long promotion, long otaorderid) {
		int count = hmsOtsOrderMapper.findPromotionBoOtsOrderId(promotion, otaorderid).size();
		return count == 1 ? true : false;
	}
}
