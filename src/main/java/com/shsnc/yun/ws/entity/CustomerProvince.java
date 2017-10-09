package com.shsnc.yun.ws.entity;

/**
 * 客户省份分布
 * 
 * @author volitation
 *
 */
public class CustomerProvince {

	private String province; //省份
	
	private int total; //数量
	

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerTrends [province=" + province + ", total=" + total + "]";
	}


	
	
}
