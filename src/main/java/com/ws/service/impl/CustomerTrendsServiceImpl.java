package com.ws.service.impl;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.CustomerTrendsDao;
import com.ws.entity.CustomerTrends;
import com.ws.service.CustomerTrendsService;
import com.ws.utils.TimeUtils;

@Service("customertrendsService")
public class CustomerTrendsServiceImpl implements CustomerTrendsService {
	
	@Autowired
	private CustomerTrendsDao customerTrendsDao;

	public List<Object> listCustomertrends() {
		List<Object> list = new ArrayList<Object>();
		
		List<CustomerTrends> dataList = new ArrayList<CustomerTrends>();
		dataList.add(customerTrendsDao.showCurrentYear());
		dataList.add(customerTrendsDao.showLastYear());
		dataList.add(customerTrendsDao.showLastTowYear());
		dataList.add(customerTrendsDao.showLastThreeYear());
		dataList.add(customerTrendsDao.showLastFourYear());
		dataList.add(customerTrendsDao.showLastFiveYear());
		for (int i=0; i<dataList.size(); i++) {
			Map<String, String> dataMap = new HashMap<String, String>();
			dataMap.put("year", TimeUtils.getYear(i));
			dataMap.put("amount", dataList.get(i).getAmount());
			list.add(dataMap);
		}		
		return list;
	}

}
