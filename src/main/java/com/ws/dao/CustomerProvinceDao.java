package com.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws.entity.CustomerProvince;

/**
 * 客户省份分布
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("customerProvinceDao")
public interface CustomerProvinceDao {
	 
	public List<CustomerProvince> listProvince();

}
