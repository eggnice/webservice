package com.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws.entity.ProductOrder;

/**
 * pools products orders
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("ProductOrderDao")
public interface ProductOrderDao {
	 
	public List<ProductOrder> listProductOrder(String pool_id);

}
