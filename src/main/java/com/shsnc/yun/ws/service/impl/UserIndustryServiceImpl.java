package com.shsnc.yun.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.UserIndustryDao;
import com.shsnc.yun.ws.entity.UserIndustry;
import com.shsnc.yun.ws.service.UserIndustryService;

@Service("userIndustryService")
public class UserIndustryServiceImpl implements UserIndustryService {
	
	@Autowired
	private UserIndustryDao userIndustryDao;

	public List<UserIndustry> listUserIndustry() {
		// TODO Auto-generated method stub
		return userIndustryDao.listUserIndustry();
	}

}
