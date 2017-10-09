package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.UserIndustry;

/**
 * 客户行业分布
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("userIndustryDao")
public interface UserIndustryDao {
	 
	public List<UserIndustry> listUserIndustry();

}
