package com.shsnc.yun.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.InternetUserDao;
import com.shsnc.yun.ws.entity.InternetUser;
import com.shsnc.yun.ws.service.InternetUserService;

@Service("internetUserService")
public class InternetUserServiceImpl implements InternetUserService {
	
	@Autowired
	private InternetUserDao internetUserDao;

	public List<InternetUser> listInternetUser() {
		// TODO Auto-generated method stub
		return internetUserDao.listInternetUser();
	}

}
