package com.auts.mp.thereis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auts.mp.thereis.dao.OrderMapper;
import com.auts.mp.thereis.model.common.PageInfo;
import com.auts.mp.thereis.model.dao.order.OrderModel;
import com.auts.mp.thereis.service.OrderService;
import com.github.pagehelper.PageHelper;

@Service
public class OrderSerivceImpl implements OrderService {
	@Autowired
	OrderMapper orderMapper;

	@Override
	public PageInfo queryOrders(String status, String startDate, String endDate, int pageNumber, int pageSize) {
		PageHelper.startPage(pageNumber, pageSize);
		List<OrderModel> list = orderMapper.queryOrders(status, startDate, endDate);
		int total = orderMapper.queryOrdersCnt(status, startDate, endDate);
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNumber(pageNumber);
		pageInfo.setPageSize(pageSize);
		pageInfo.setDataList(list);
		pageInfo.setTotal(total);
		return pageInfo;
	}

	@Override
	@Transactional
	public void orderSettle(String uid) {
		orderMapper.orderSettle(uid);
	}

	@Override
	@Transactional
	public void orderFailure(String uid) {
		orderMapper.orderFailure(uid);
	}

	@Override
	@Transactional
	public void orderContract(String uid) {
		orderMapper.orderContract(uid);
	}

	@Override
	@Transactional
	public void orderSettled(String uid) {
		orderMapper.orderSettled(uid);
	}

	@Override
	@Transactional
	public void orderPay(String uid) {
		orderMapper.orderPay(uid);
	}

	@Override
	public OrderModel queryOrder(String uid) {
		return orderMapper.queryOrder(uid);
	}

}