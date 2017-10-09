package com.shsnc.yun.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 壮智凌云
 * 		-- webservice接口
 * 
 * @author volitation
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface ZZLYWebService {
	
	@WebMethod 
	public String test(@WebParam String str);
	
	/**
	 * 显示所有省份信息
	 * @return
	 */
	@WebMethod 
	public Object showProvince();

	/**
	 * 显示最近6个月客户发展趋势
	 * @return
	 */
	@WebMethod 
	public Object showCustomertrends();
	
	/**
	 * 显示所有集团客户信息
	 * @return
	 */
	@WebMethod 
	public Object showGroupUser();
	
	/**
	 * 显示所有互联网客户信息
	 * @return
	 */
	@WebMethod 
	public Object showInternetUser();
	
	/**
	 * 显示最近12个月品订购趋势信息
	 * @return
	 */
	@WebMethod 
	public Object showProductOrderTrend();
	
	/**
	 * 显示客户行业分布信息
	 * @return
	 */
	@WebMethod 
	public Object showUserIndustry();

	/**
	 * 显示华南华北容量管理信息
	 * @return
	 */
	@WebMethod
	public Object showCapacityManagement();
}
