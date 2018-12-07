package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.TotalOrderDao;
import com.ws.entity.TotalOrder;
import com.ws.service.TotalOrderService;

@Service("totalOrderService")
public class TotalOrderServiceImpl implements TotalOrderService {
	
	@Autowired
	private TotalOrderDao totalOrderDao;

	public List<Object> listTotalOrder() {
		List<Object> list = new ArrayList<Object>();
		Map<String, Integer> resultMap = new HashMap<String, Integer>();

		TotalOrder allOrderData = totalOrderDao.listAllOrder();
		resultMap.put("allOrder", allOrderData.getTotal());

		TotalOrder realTimeData = totalOrderDao.listRealTimeOrder();
		resultMap.put("realTimeOrder", realTimeData.getTotal());
		list.add(resultMap);
		
		return list;
	}

}
