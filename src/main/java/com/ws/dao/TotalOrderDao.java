package com.ws.dao;

//import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws.entity.TotalOrder;

/**
 * 总订单量
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("ToatlOrderDao")
public interface TotalOrderDao {
	 
	public TotalOrder listAllOrder();
	
	public TotalOrder listRealTimeOrder();

}
