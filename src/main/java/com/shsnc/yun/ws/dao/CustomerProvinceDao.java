package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.CustomerProvince;

/**
 * 客户省份分布
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("customerProvinceDao")
public interface CustomerProvinceDao {
	 
	public List<CustomerProvince> listProvince();

}
