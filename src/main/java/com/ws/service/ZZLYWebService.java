package com.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 壮智凌云
 * 		-- webservice接口
 * 
 * @author eggnice
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface ZZLYWebService {
	
	@WebMethod 
	public String test(@WebParam String str);
	
	/**
	 * 显示华南华北容量管理信息
	 * @return
	 */
	@WebMethod
	public Object showCapacityManagement();
	
	/**
	 * 显示所有省份信息
	 * @return
	 */
	@WebMethod 
	public Object showProvince();

	/**
	 * 显示最近6年客户发展趋势
	 * @return
	 */
	@WebMethod 
	public Object showCustomertrends();
	
	/**
	 * 显示各资源池订单量
	 * @return
	 */
	@WebMethod 
	public Object showPoolOrder();
	
	/**
	 * 显示产品订单量
	 * @return
	 */
	@WebMethod 
	public Object showProductOrder();
	
	/**
	 * 显示产品前五
	 * @return
	 */
	@WebMethod 
	public Object showTopFive();
	
	/**
	 * 显示客户总量
	 * @return
	 */
	@WebMethod 
	public Object showTotalCustomer();
	
	/**
	 * 显示产品总量
	 * @return
	 */
	@WebMethod 
	public Object showTotalOrder();
	
	/**
	 * 显示客户行业分布信息
	 * @return
	 */
	@WebMethod 
	public Object showUserIndustry();


}
