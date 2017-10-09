package com.shsnc.yun.ws.entity;

/**
 * 容量管理
 * 
 * @author volitation
 *
 */
public class CapacityManagement {
	
	private Integer cpu ; //cpu总量
	
	private Integer ucpu; //cpu使用量
	
	private Integer mem; //内存总量
	
	private Integer umem; //内存使用量
	
	private String cbs; //云硬盘总量
	
	private String ucbs; //云硬盘使用量
	
	private String pbs; //硬盘总量
	
	private String upbs; //硬盘使用量
	
	private String obs; //云存储总量
	
	private String uobs; //云存储使用量
	
	private Integer bandwidth ; //公网带宽总量
	
	private Integer ubandwidth ; //公网带宽使用量
	
	private Integer pubip; //公网IP总量
	
	private Integer upubip; //公网IP使用量

	/**
	 * @return the cpu
	 */
	public Integer getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the ucpu
	 */
	public Integer getUcpu() {
		return ucpu;
	}

	/**
	 * @param ucpu the ucpu to set
	 */
	public void setUcpu(Integer ucpu) {
		this.ucpu = ucpu;
	}

	/**
	 * @return the mem
	 */
	public Integer getMem() {
		return mem;
	}

	/**
	 * @param mem the mem to set
	 */
	public void setMem(Integer mem) {
		this.mem = mem;
	}

	/**
	 * @return the umem
	 */
	public Integer getUmem() {
		return umem;
	}

	/**
	 * @param umem the umem to set
	 */
	public void setUmem(Integer umem) {
		this.umem = umem;
	}

	/**
	 * @return the cbs
	 */
	public String getCbs() {
		return cbs;
	}

	/**
	 * @param cbs the cbs to set
	 */
	public void setCbs(String cbs) {
		this.cbs = cbs;
	}

	/**
	 * @return the ucbs
	 */
	public String getUcbs() {
		return ucbs;
	}

	/**
	 * @param ucbs the ucbs to set
	 */
	public void setUcbs(String ucbs) {
		this.ucbs = ucbs;
	}

	/**
	 * @return the pbs
	 */
	public String getPbs() {
		return pbs;
	}

	/**
	 * @param pbs the pbs to set
	 */
	public void setPbs(String pbs) {
		this.pbs = pbs;
	}

	/**
	 * @return the upbs
	 */
	public String getUpbs() {
		return upbs;
	}

	/**
	 * @param upbs the upbs to set
	 */
	public void setUpbs(String upbs) {
		this.upbs = upbs;
	}

	/**
	 * @return the obs
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * @param obs the obs to set
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

	/**
	 * @return the uobs
	 */
	public String getUobs() {
		return uobs;
	}

	/**
	 * @param uobs the uobs to set
	 */
	public void setUobs(String uobs) {
		this.uobs = uobs;
	}

	/**
	 * @return the bandwidth
	 */
	public Integer getBandwidth() {
		return bandwidth;
	}

	/**
	 * @param bandwidth the bandwidth to set
	 */
	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	/**
	 * @return the ubandwidth
	 */
	public Integer getUbandwidth() {
		return ubandwidth;
	}

	/**
	 * @param ubandwidth the ubandwidth to set
	 */
	public void setUbandwidth(Integer ubandwidth) {
		this.ubandwidth = ubandwidth;
	}

	/**
	 * @return the pubip
	 */
	public Integer getPubip() {
		return pubip;
	}

	/**
	 * @param pubip the pubip to set
	 */
	public void setPubip(Integer pubip) {
		this.pubip = pubip;
	}

	/**
	 * @return the upubip
	 */
	public Integer getUpubip() {
		return upubip;
	}

	/**
	 * @param upubip the upubip to set
	 */
	public void setUpubip(Integer upubip) {
		this.upubip = upubip;
	}



	
}
