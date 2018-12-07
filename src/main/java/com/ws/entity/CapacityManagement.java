package com.ws.entity;

/**
 * 容量管理
 * 
 * @author eggnice
 *
 */
public class CapacityManagement {
	
	private Integer cpu ; //cpu总量
	
	private Integer ucpu; //cpu使用量
	
	private Integer mem; //内存总量
	
	private Integer umem; //内存使用量
	
	private Integer disk;
	
	private Integer udisk;
	
	private Long cbs; //云硬盘总量
	
	private Long ucbs; //云硬盘使用量
	
	private Integer pbs; //硬盘总量
	
	private Integer upbs; //硬盘使用量
	
	private Integer obs; //云存储总量
	
	private Integer uobs; //云存储使用量
	
	private Integer webdisk;
	
	private Integer uwebdisk;
	
	private Integer bandwidth ; //公网带宽总量
	
	private Integer ubandwidth ; //公网带宽使用量
	
	private Integer pubip; //公网IP总量
	
	private Integer upubip; //公网IP使用量
	
	private Integer elb;
	
	private Integer uelb;

	
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
	public Long getCbs() {
		return cbs;
	}

	/**
	 * @param cbs the cbs to set
	 */
	public void setCbs(Long cbs) {
		this.cbs = cbs;
	}

	/**
	 * @return the ucbs
	 */
	public Long getUcbs() {
		return ucbs;
	}

	/**
	 * @param ucbs the ucbs to set
	 */
	public void setUcbs(Long ucbs) {
		this.ucbs = ucbs;
	}

	/**
	 * @return the pbs
	 */
	public Integer getPbs() {
		return pbs;
	}

	/**
	 * @param pbs the pbs to set
	 */
	public void setPbs(Integer pbs) {
		this.pbs = pbs;
	}

	/**
	 * @return the upbs
	 */
	public Integer getUpbs() {
		return upbs;
	}

	/**
	 * @param upbs the upbs to set
	 */
	public void setUpbs(Integer upbs) {
		this.upbs = upbs;
	}

	/**
	 * @return the obs
	 */
	public Integer getObs() {
		return obs;
	}

	/**
	 * @param obs the obs to set
	 */
	public void setObs(Integer obs) {
		this.obs = obs;
	}

	/**
	 * @return the uobs
	 */
	public Integer getUobs() {
		return uobs;
	}

	/**
	 * @param uobs the uobs to set
	 */
	public void setUobs(Integer uobs) {
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

	public Integer getDisk() {
		return disk;
	}

	public void setDisk(Integer disk) {
		this.disk = disk;
	}

	public Integer getUdisk() {
		return udisk;
	}

	public void setUdisk(Integer udisk) {
		this.udisk = udisk;
	}

	public Integer getWebdisk() {
		return webdisk;
	}

	public void setWebdisk(Integer webdisk) {
		this.webdisk = webdisk;
	}

	public Integer getUwebdisk() {
		return uwebdisk;
	}

	public void setUwebdisk(Integer uwebdisk) {
		this.uwebdisk = uwebdisk;
	}

	public Integer getElb() {
		return elb;
	}

	public void setElb(Integer elb) {
		this.elb = elb;
	}

	public Integer getUelb() {
		return uelb;
	}

	public void setUelb(Integer uelb) {
		this.uelb = uelb;
	}



	
}
