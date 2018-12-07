package com.ws.dao;

import org.springframework.stereotype.Repository;

import com.ws.entity.TotalCustomer;

/**
 * 用户量
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("ToatlCustomerDao")
public interface TotalCustomerDao {
	 
	public TotalCustomer listGroupCustomer();
	
	public TotalCustomer listInternetCustomer();

}
