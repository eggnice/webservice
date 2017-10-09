package com.shsnc.yun.ws.dao;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.Customertrends;

/**
 * 客户发展趋势
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("customertrendsDao")
public interface CustomertrendsDao {
	
	public Customertrends showFirstMonth();
	
	public Customertrends showSecondMonth();
	
	public Customertrends showThirdMonth();
	
	public Customertrends showFourthMonth();
	
	public Customertrends showFifthMonth();
	
	public Customertrends showSixthMonth();
	

}
