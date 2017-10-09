package com.shsnc.yun.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.CustomertrendsDao;
import com.shsnc.yun.ws.service.CustomertrendsService;
import com.shsnc.yun.ws.utils.TimeUtils;

@Service("customertrendsService")
public class CustomertrendsServiceImpl implements CustomertrendsService {
	
	@Autowired
	private CustomertrendsDao customertrendsDao;

	public List<Object> listCustomertrends() {
		List<Object> list = new ArrayList<Object>();

		Map<String, Object> firstMap = new HashMap<String, Object>();
		firstMap.put("month", TimeUtils.last12Months()[6]);
		firstMap.put("amount", customertrendsDao.showFirstMonth().getAmount());
		list.add(firstMap);
		
		Map<String, Object> secondMap = new HashMap<String, Object>();
		secondMap.put("month", TimeUtils.last12Months()[7]);
		secondMap.put("amount", customertrendsDao.showSecondMonth().getAmount());
		list.add(secondMap);
		
		Map<String, Object> thirdMap = new HashMap<String, Object>();
		thirdMap.put("month", TimeUtils.last12Months()[8]);
		thirdMap.put("amount", customertrendsDao.showThirdMonth().getAmount());
		list.add(thirdMap);
		
		Map<String, Object> fourthMap = new HashMap<String, Object>();
		fourthMap.put("month", TimeUtils.last12Months()[9]);
		fourthMap.put("amount", customertrendsDao.showFourthMonth().getAmount());
		list.add(fourthMap);
		
		Map<String, Object> fifthMap = new HashMap<String, Object>();
		fifthMap.put("month", TimeUtils.last12Months()[10]);
		fifthMap.put("amount", customertrendsDao.showFifthMonth().getAmount());
		list.add(fifthMap);
		
		Map<String, Object> sixthMap = new HashMap<String, Object>();
		sixthMap.put("month", TimeUtils.last12Months()[11]);
		sixthMap.put("amount", customertrendsDao.showSixthMonth().getAmount());
		list.add(sixthMap);
		
		return list;
	}

}
