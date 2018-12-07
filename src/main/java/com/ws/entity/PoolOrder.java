package com.ws.entity;

/**
 * 资源池订单
 * @author eggnice
 *
 */
public class PoolOrder {
	
	private String pool; //资源池名称
	
	private int total; //订单数量


	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "UserIndustry [pool=" + pool + ", total=" + total + "]";
	}
	
	

}
