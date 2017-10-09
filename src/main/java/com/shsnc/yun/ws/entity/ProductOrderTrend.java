package com.shsnc.yun.ws.entity;

/**
 * 产品订购趋势
 * @author volitation
 *
 */
public class ProductOrderTrend {
	
	private String productName; //产品名称
	
	private int total; //产品订购数量

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductOrderTrend [productName=" + productName + ", total=" + total + "]";
	}


	
	

}
