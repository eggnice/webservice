package com.ws.entity;

/**
 * top five products
 * 
 * @author eggnice
 *
 */
public class TopFive {

	private String total; // 订单数量

	private String product;

	private String result; //产品规格

	private String cpu;

	private String ram;
	

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "TotalOrder [total=" + total + "]";
	}

}
