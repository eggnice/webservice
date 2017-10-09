package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.CapacityManagement;

/**
 * 容量管理
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("capacityManagementDao")
public interface CapacityManagementDao {
	
	public List<CapacityManagement> southCpuMem();
	
	public List<CapacityManagement> northCpuMem();
	
	public CapacityManagement southCbsPbs();
	
	public CapacityManagement southUseCbsPbs();
	
	public CapacityManagement southObs();
	
	public CapacityManagement northCbsPbsObs();
	
	public CapacityManagement northUseCbsPbsObs();
	
	public CapacityManagement southBandwidthIp();
	
	public CapacityManagement southUseBandwidthIp();
	
	public CapacityManagement northBandwidthIp();
	
	public CapacityManagement northUseBandwidthIp();

}
