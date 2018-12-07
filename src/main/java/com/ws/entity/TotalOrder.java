package com.ws.entity;

/**
 * 总订单
 * @author eggnice
 *
 */
public class TotalOrder {
	
	private int total; //订单数量


	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "TotalOrder [total=" + total + "]";
	}
	
	

}
