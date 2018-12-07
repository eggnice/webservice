package com.ws.dao;

/**import java.util.List;*/

import org.springframework.stereotype.Repository;

import com.ws.entity.CapacityManagement;

/**
 * 容量管理
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("capacityManagementDao")
public interface CapacityManagementDao {
	
	public CapacityManagement machin();
	
	public CapacityManagement storage();
	
	public CapacityManagement network();
	
}
