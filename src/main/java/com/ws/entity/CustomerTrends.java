package com.ws.entity;

/**
 * 客户发展趋势
 * 
 * @author eggnice
 *
 */
public class CustomerTrends {

	private String amount; // 用户数量

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
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
