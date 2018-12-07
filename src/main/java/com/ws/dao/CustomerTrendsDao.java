package com.ws.dao;

import org.springframework.stereotype.Repository;

import com.ws.entity.CustomerTrends;

/**
 * 客户发展趋势
 * 		-- Dao层接口
 * 
 * @author eggnice
 *
 */
@Repository("customertrendsDao")
public interface CustomerTrendsDao {
	
	public CustomerTrends showCurrentYear();
	
	public CustomerTrends showLastYear();
	
	public CustomerTrends showLastTowYear();
	
	public CustomerTrends showLastThreeYear();
	
	public CustomerTrends showLastFourYear();
	
	public CustomerTrends showLastFiveYear();
	

}
