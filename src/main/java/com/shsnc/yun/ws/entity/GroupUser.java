package com.shsnc.yun.ws.entity;

/**
 * 产品订购情况 
 * 		-- 集团客户
 * @author volitation
 *
 */
public class GroupUser {

	private String groupUserName; //集团客户名称
	
	private int groupUserTotal; //集团客户产品订购数量


	public String getGroupUserName() {
		return groupUserName;
	}

	public void setGroupUserName(String groupUserName) {
		this.groupUserName = groupUserName;
	}

	public int getGroupUserTotal() {
		return groupUserTotal;
	}

	public void setGroupUserTotal(int groupUserTotal) {
		this.groupUserTotal = groupUserTotal;
	}

	@Override
	public String toString() {
		return "GroupUser [groupUserName=" + groupUserName + ", groupUserTotal=" + groupUserTotal + "]";
	}
	
	
}
