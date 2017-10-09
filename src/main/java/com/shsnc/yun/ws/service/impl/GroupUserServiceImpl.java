package com.shsnc.yun.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.GroupUserDao;
import com.shsnc.yun.ws.entity.GroupUser;
import com.shsnc.yun.ws.service.GroupUserService;

@Service("groupUserService")
public class GroupUserServiceImpl implements GroupUserService {
	
	@Autowired
	private GroupUserDao groupUserDao;

	public List<GroupUser> listGroupUser() {
		// TODO Auto-generated method stub
		return groupUserDao.listGroupUser();
	}

}
