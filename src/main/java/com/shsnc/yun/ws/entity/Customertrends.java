package com.shsnc.yun.ws.entity;

/**
 * 客户发展趋势
 * 
 * @author volitation
 *
 */
public class Customertrends {

	private int amount; // 用户数量

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customertrends [amount=" + amount + "]";
	}
	
	
}
