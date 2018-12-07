package com.ws.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
import com.ws.utils.JsonUtils;

@Controller
public class WebServiceController {

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


	@ResponseBody
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mav = null;
		List<String> list = null;

		try {
			list = new ArrayList<String>();
			List<Object> capacityManagementList = capacityManagementService.listCapacityManagement();
			List<CustomerProvince> infoList = customerProvinceService.listProvince();
			List<Object> customertrendsList = customerTrendsService.listCustomertrends();
			List<Object> poolOrderList = poolOrderService.listPoolOrder();
			List<Object> productOrderList = productOrderService.listProductOrder();
			List<Object> topFiveList = topFiveService.listTopFive();
			List<Object> totalCustomerList = totalCustomerService.listTotalCustomer();
			List<Object> totalOrderList = totalOrderService.listTotalOrder();
			List<UserIndustry> userIndustryList = userIndustryService.listUserIndustry();
			
			Object capacityManagementObj = JsonUtils.toJSON(capacityManagementList, false);
			Object customerProviceObj = JsonUtils.toJSON(infoList, false);
			Object customertrendsObj = JsonUtils.toJSON(customertrendsList, false);
			Object poolOrderObj = JsonUtils.toJSON(poolOrderList, false);
			Object productOrderObj = JsonUtils.toJSON(productOrderList, false);
			Object topFiveObj = JsonUtils.toJSON(topFiveList, false);
			Object totalCustomerObj = JsonUtils.toJSON(totalCustomerList, false);
			Object totalOrderObj = JsonUtils.toJSON(totalOrderList, false);
			Object userIndustryObj = JsonUtils.toJSON(userIndustryList, false);
						
			list.add("容量管理——————" + capacityManagementObj.toString());
			list.add("客户发展趋势:各省份客户数据——————" + customerProviceObj.toString());
	        list.add("客户发展趋势——————" + customertrendsObj.toString());
			list.add("资源池订单量——————" + poolOrderObj.toString());
			list.add("产品订单量——————" + productOrderObj.toString());
			list.add("前五产品——————" + topFiveObj.toString());
			list.add("客户总量——————" + totalCustomerObj.toString());
			list.add("订单总量——————" + totalOrderObj.toString());
			list.add("客户行业分布——————" + userIndustryObj);

			
		} catch (Exception e) {
			e.printStackTrace();
			String abnormalType = e.getCause().getClass().toString();
			String abnormalName = e.getCause().getMessage();
			list.add("异常类型："+abnormalType);
			list.add("异常点信息："+abnormalName);
		}
		mav = new ModelAndView("index");
		mav.addObject("list", list);
		return mav;
	}

}
