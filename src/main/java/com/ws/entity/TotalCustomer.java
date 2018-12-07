package com.ws.entity;

/**
 * 总客户量
 * @author eggnice
 *
 */
public class TotalCustomer {
	
	
	private String total; //订单数量


	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "UserIndustry [total=" + total + "]";
	}
	
	

}
