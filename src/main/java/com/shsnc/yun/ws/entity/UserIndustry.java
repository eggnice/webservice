package com.shsnc.yun.ws.entity;

/**
 * 客户行业分布
 * @author volitation
 *
 */
public class UserIndustry {
	
	private String industryName; //行业名称
	
	private int total; //行业客户数量


	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "UserIndustry [industryName=" + industryName + ", total=" + total + "]";
	}
	
	

}
