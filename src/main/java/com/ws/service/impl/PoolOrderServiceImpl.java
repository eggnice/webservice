package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.PoolOrderDao;
import com.ws.entity.PoolOrder;
import com.ws.service.PoolOrderService;

@Service("poolOrderService")
public class PoolOrderServiceImpl implements PoolOrderService {
	
	@Autowired
	private PoolOrderDao poolOrderDao;

	public List<Object> listPoolOrder() {
		List<Object> list = new ArrayList<Object>();
		
		List<PoolOrder> dataList = poolOrderDao.listPoolOrder();
		for (int i=0; i<dataList.size(); i++) {
			list.add(dataList.get(i));
		}
	
		return list;
	}

}
