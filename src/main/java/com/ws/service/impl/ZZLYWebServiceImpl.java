package com.ws.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//import com.ws.dao.CustomerProvinceDao;
import com.ws.entity.CustomerProvince;
import com.ws.entity.UserIndustry;
import com.ws.service.CapacityManagementService;
import com.ws.service.CustomerProvinceService;
import com.ws.service.CustomerTrendsService;
import com.ws.service.PoolOrderService;
import com.ws.service.ProductOrderService;
import com.ws.service.TopFiveService;
import com.ws.service.TotalCustomerService;
import com.ws.service.TotalOrderService;
import com.ws.service.UserIndustryService;
import com.ws.service.ZZLYWebService;
import com.ws.utils.AbnormalUtils;
import com.ws.utils.JsonUtils;

/**
 * 壮智凌云
 * 		-- webservice实现层
 * 
 * @author eggnice
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class ZZLYWebServiceImpl implements ZZLYWebService {
	
	@Resource
	private CapacityManagementService capacityManagementService;
	
	@Resource
	private CustomerProvinceService customerProvinceService;

	@Resource
	private CustomerTrendsService customerTrendsService;

	@Resource
	private PoolOrderService poolOrderService;

	@Resource
	private ProductOrderService productOrderService;

	@Resource
	private TopFiveService topFiveService;
	
	@Resource
	private TotalCustomerService totalCustomerService;
	
	@Resource
	private TotalOrderService totalOrderService;

	@Resource
	private UserIndustryService userIndustryService;
	

	@WebMethod 
	public String test(String str) {
		return "Hello "+str;
	}

	/**
	 * 显示华南2容量管理信息
	 */
	@WebMethod 
	public Object showCapacityManagement() {
		Object obj = null;
		try{
			List<Object> list = capacityManagementService.listCapacityManagement();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	
	/**
	 * 显示所有省份信息
	 */
	@WebMethod 
	public Object showProvince() {
		Object obj = null;
		try{
			List<CustomerProvince> list = customerProvinceService.listProvince();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	
	/**
	 * 显示最近六年客户发展趋势
	 */
	@WebMethod 
	public Object showCustomertrends() {
		Object obj = null;
		try{
			List<Object> list = customerTrendsService.listCustomertrends();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示各资源池订单量
	 */
	@WebMethod 
	public Object showPoolOrder() {
		Object obj = null;
		try{
			List<Object> list = poolOrderService.listPoolOrder();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示产品订单量
	 */
	@WebMethod 
	public Object showProductOrder() {
		Object obj = null;
		try{
			List<Object> list = productOrderService.listProductOrder();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示前五产品
	 */
	@WebMethod 
	public Object showTopFive() {
		Object obj = null;
		try{
			List<Object> list = topFiveService.listTopFive();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	
	/**
	 * 显示客户总量
	 */
	@WebMethod 
	public Object showTotalCustomer() {
		Object obj = null;
		try{
			List<Object> list = totalCustomerService.listTotalCustomer();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	
	/**
	 * 显示订单总量
	 */
	@WebMethod 
	public Object showTotalOrder() {
		Object obj = null;
		try{
			List<Object> list = totalOrderService.listTotalOrder();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	/**
	 * 显示客户行业分布信息
	 */
	@WebMethod 
	public Object showUserIndustry() {
		Object obj = null;
		try{
			List<UserIndustry> list = userIndustryService.listUserIndustry();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

}
