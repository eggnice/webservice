package com.ws.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ws.entity.TopFive;

/**
 * top five products
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("TopFiveDao")
public interface TopFiveDao {
	
	public List<TopFive> listComputeTopFive();
	
	public List<TopFive> listDiskTopFive();
	
	public List<TopFive> listCloudSpaceTopFive();
	
	public List<TopFive> listBandwidthTopFive();
	

}
