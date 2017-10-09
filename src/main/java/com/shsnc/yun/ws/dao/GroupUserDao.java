package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.GroupUser;

/**
 * 产品订购情况 
 * 		-- 集团客户
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("groupUserDao")
public interface GroupUserDao {
	 
	public List<GroupUser> listGroupUser();

}
