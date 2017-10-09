package com.shsnc.yun.ws.entity;

/**
 * 产品订购情况
 * 		 -- 互联网客户
 * @author volitation
 *
 */
public class InternetUser {
	
	private String userName; //互联网客户名称
	
	private int total; //互联网客户产品订购数量


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "InternetUser [userName=" + userName + ", total=" + total + "]";
	}
	
	

}
