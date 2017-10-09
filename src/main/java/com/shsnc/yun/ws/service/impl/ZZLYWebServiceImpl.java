package com.shsnc.yun.ws.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.shsnc.yun.ws.dao.CustomerProvinceDao;
import com.shsnc.yun.ws.entity.CustomerProvince;
import com.shsnc.yun.ws.entity.GroupUser;
import com.shsnc.yun.ws.entity.InternetUser;
import com.shsnc.yun.ws.entity.UserIndustry;
import com.shsnc.yun.ws.service.CapacityManagementService;
import com.shsnc.yun.ws.service.CustomertrendsService;
import com.shsnc.yun.ws.service.GroupUserService;
import com.shsnc.yun.ws.service.InternetUserService;
import com.shsnc.yun.ws.service.ProductOrderTrendService;
import com.shsnc.yun.ws.service.UserIndustryService;
import com.shsnc.yun.ws.service.ZZLYWebService;
import com.shsnc.yun.ws.utils.AbnormalUtils;
import com.shsnc.yun.ws.utils.JsonUtils;

/**
 * 壮智凌云
 * 		-- webservice实现层
 * 
 * @author volitation
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class ZZLYWebServiceImpl implements ZZLYWebService {
	
	@Resource
	private CustomerProvinceDao customerProvinceDao;
	
	@Resource
	private CustomertrendsService customertrendsService;
	
	@Resource
	private GroupUserService groupUserService;
	
	@Resource
	private InternetUserService internetUserService;
	
	@Resource
	private ProductOrderTrendService productOrderTrendService;
	
	@Resource
	private UserIndustryService userIndustryService;
	
	@Resource
	private CapacityManagementService capacityManagementService;

	@WebMethod 
	public String test(String str) {
		return "Hello "+str;
	}

	/**
	 * 显示所有省份信息
	 */
	@WebMethod 
	public Object showProvince() {
		Object obj = null;
		try{
			List<CustomerProvince> list = customerProvinceDao.listProvince();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}
	
	/**
	 * 显示最近6个月客户发展趋势
	 */
	@WebMethod 
	public Object showCustomertrends() {
		Object obj = null;
		try{
			List<Object> list = customertrendsService.listCustomertrends();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示所有集团客户信息
	 */
	@WebMethod 
	public Object showGroupUser() {
		Object obj = null;
		try{
			List<GroupUser> list = groupUserService.listGroupUser();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示所有互联网客户信息
	 */
	@WebMethod 
	public Object showInternetUser() {
		Object obj = null;
		try{
			List<InternetUser> list = internetUserService.listInternetUser();
			obj = JsonUtils.toJSON(list,false);
		}catch(Exception e){
			e.printStackTrace();
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

	/**
	 * 显示最近12个月品订购趋势信息
	 */
	@WebMethod 
	public Object showProductOrderTrend() {
		Object obj = null;
		try{
			List<Object> list = productOrderTrendService.listProductOrderTrend();
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

	/**
	 * 显示华南华北容量管理信息
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

	


	


}
