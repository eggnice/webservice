package com.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.CustomerProvinceDao;
import com.ws.entity.CustomerProvince;
import com.ws.service.CustomerProvinceService;

@Service("customerProvinceService")
public class CustomerProvinceServiceImpl implements CustomerProvinceService {
	
	@Autowired
	private CustomerProvinceDao customerProvinceDao;

	public List<CustomerProvince> listProvince() {
		return customerProvinceDao.listProvince();
	}

}
