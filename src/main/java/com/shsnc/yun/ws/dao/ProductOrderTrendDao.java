package com.shsnc.yun.ws.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsnc.yun.ws.entity.ProductOrderTrend;

/**
 * 产品订购趋势
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("productOrderTrendDao")
public interface ProductOrderTrendDao {
	 
	public List<ProductOrderTrend> showFirstMonth();
	
	public List<ProductOrderTrend> showSecondMonth();
	
	public List<ProductOrderTrend> showThirdMonth();
	
	public List<ProductOrderTrend> showFourthMonth();
	
	public List<ProductOrderTrend> showFifthMonth();
	
	public List<ProductOrderTrend> showSixthMonth();
	
	public List<ProductOrderTrend> showSeventhMonth();
	
	public List<ProductOrderTrend> showEighthMonth();
	
	public List<ProductOrderTrend> showNinthMonth();
	
	public List<ProductOrderTrend> showTenthMonth();
	
	public List<ProductOrderTrend> showEleventhMonth();
	
	public List<ProductOrderTrend> showTwelfthMonth();

}
