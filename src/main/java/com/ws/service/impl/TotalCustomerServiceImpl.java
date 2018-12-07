package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.TotalCustomerDao;
import com.ws.entity.TotalCustomer;
import com.ws.service.TotalCustomerService;

@Service("totalCustomerService")
public class TotalCustomerServiceImpl implements TotalCustomerService {
	
	@Autowired
	private TotalCustomerDao totalCustomerDao;

	public List<Object> listTotalCustomer() {
		List<Object> list = new ArrayList<Object>();
		Map<String, String> groupMap = new HashMap<String, String>();
		TotalCustomer groupData = totalCustomerDao.listGroupCustomer();
		groupMap.put("total", groupData.getTotal());
		groupMap.put("customer", "groupCustomer");
		list.add(groupMap);
		
		Map<String, String> internetMap = new HashMap<String, String>();
		TotalCustomer internetData = totalCustomerDao.listInternetCustomer();
		internetMap.put("total", internetData.getTotal());
		internetMap.put("customer", "internetCustomer");
		list.add(internetMap);
		
		return list;
	}

}
