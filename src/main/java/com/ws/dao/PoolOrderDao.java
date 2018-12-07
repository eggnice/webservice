package com.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws.entity.PoolOrder;

/**
 * pools order
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("PoolOrderDao")
public interface PoolOrderDao {
	 
	public List<PoolOrder> listPoolOrder();

}
