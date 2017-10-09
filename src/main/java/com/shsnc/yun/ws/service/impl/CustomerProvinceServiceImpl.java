package com.shsnc.yun.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.CustomerProvinceDao;
import com.shsnc.yun.ws.entity.CustomerProvince;
import com.shsnc.yun.ws.service.CustomerProvinceService;

@Service("customerProvinceService")
public class CustomerProvinceServiceImpl implements CustomerProvinceService {
	
	@Autowired
	private CustomerProvinceDao customerProvinceDao;

	public List<CustomerProvince> listProvince() {
		return customerProvinceDao.listProvince();
	}

}
