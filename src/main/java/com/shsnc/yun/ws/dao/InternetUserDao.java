package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.InternetUser;

/**
 * 产品订购情况 
 * 		-- 互联网客户
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("internetUserDao")
public interface InternetUserDao {
	 
	public List<InternetUser> listInternetUser();

}
