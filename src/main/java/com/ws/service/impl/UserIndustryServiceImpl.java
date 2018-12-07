package com.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.UserIndustryDao;
import com.ws.entity.UserIndustry;
import com.ws.service.UserIndustryService;

@Service("userIndustryService")
public class UserIndustryServiceImpl implements UserIndustryService {
	
	@Autowired
	private UserIndustryDao userIndustryDao;

	public List<UserIndustry> listUserIndustry() {
		// TODO Auto-generated method stub
		return userIndustryDao.listUserIndustry();
	}

}
