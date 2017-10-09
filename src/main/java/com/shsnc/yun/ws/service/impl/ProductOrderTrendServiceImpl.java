package com.shsnc.yun.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.ProductOrderTrendDao;
import com.shsnc.yun.ws.service.ProductOrderTrendService;
import com.shsnc.yun.ws.utils.TimeUtils;

@Service("productOrderTrendService")
public class ProductOrderTrendServiceImpl implements ProductOrderTrendService {
	
	@Autowired
	private ProductOrderTrendDao productOrderTrendDao;

	public List<Object> listProductOrderTrend() {
		List<Object> list = new ArrayList<Object>();
		
		Map<String, Object> firstMap = new HashMap<String, Object>();
		firstMap.put("month", TimeUtils.last12Months()[0]);
		firstMap.put("data", productOrderTrendDao.showFirstMonth());
		list.add(firstMap);
		
		Map<String, Object> secondMap = new HashMap<String, Object>();
		secondMap.put("month", TimeUtils.last12Months()[1]);
		secondMap.put("data", productOrderTrendDao.showSecondMonth());
		list.add(secondMap);
		
		Map<String, Object> thirdMap = new HashMap<String, Object>();
		thirdMap.put("month", TimeUtils.last12Months()[2]);
		thirdMap.put("data", productOrderTrendDao.showThirdMonth());
		list.add(thirdMap);
		
		Map<String, Object> fourthMap = new HashMap<String, Object>();
		fourthMap.put("month", TimeUtils.last12Months()[3]);
		fourthMap.put("data", productOrderTrendDao.showFourthMonth());
		list.add(fourthMap);
		
		Map<String, Object> fifthMap = new HashMap<String, Object>();
		fifthMap.put("month", TimeUtils.last12Months()[4]);
		fifthMap.put("data", productOrderTrendDao.showFifthMonth());
		list.add(fifthMap);
		
		Map<String, Object> sixthMap = new HashMap<String, Object>();
		sixthMap.put("month", TimeUtils.last12Months()[5]);
		sixthMap.put("data", productOrderTrendDao.showSixthMonth());
		list.add(sixthMap);
		
		Map<String, Object> seventhMap = new HashMap<String, Object>();
		seventhMap.put("month", TimeUtils.last12Months()[6]);
		seventhMap.put("data", productOrderTrendDao.showSeventhMonth());
		list.add(seventhMap);
		
		Map<String, Object> eighthMap = new HashMap<String, Object>();
		eighthMap.put("month", TimeUtils.last12Months()[7]);
		eighthMap.put("data", productOrderTrendDao.showEighthMonth());
		list.add(eighthMap);
		
		Map<String, Object> ninthMap = new HashMap<String, Object>();
		ninthMap.put("month", TimeUtils.last12Months()[8]);
		ninthMap.put("data", productOrderTrendDao.showNinthMonth());
		list.add(ninthMap);
		
		Map<String, Object> tenthMap = new HashMap<String, Object>();
		tenthMap.put("month", TimeUtils.last12Months()[9]);
		tenthMap.put("data", productOrderTrendDao.showTenthMonth());
		list.add(tenthMap);
		
		Map<String, Object> eleventhMap = new HashMap<String, Object>();
		eleventhMap.put("month", TimeUtils.last12Months()[10]);
		eleventhMap.put("data", productOrderTrendDao.showEleventhMonth());
		list.add(eleventhMap);
		
		Map<String, Object> twelfthMap = new HashMap<String, Object>();
		twelfthMap.put("month", TimeUtils.last12Months()[11]);
		twelfthMap.put("data", productOrderTrendDao.showTwelfthMonth());
		list.add(twelfthMap);
		
		return list;
	}


}
