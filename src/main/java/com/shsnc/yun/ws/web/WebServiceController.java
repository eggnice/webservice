package com.shsnc.yun.ws.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shsnc.yun.ws.entity.CustomerProvince;
import com.shsnc.yun.ws.entity.GroupUser;
import com.shsnc.yun.ws.entity.InternetUser;
import com.shsnc.yun.ws.entity.UserIndustry;
import com.shsnc.yun.ws.service.CapacityManagementService;
import com.shsnc.yun.ws.service.CustomerProvinceService;
import com.shsnc.yun.ws.service.CustomertrendsService;
import com.shsnc.yun.ws.service.GroupUserService;
import com.shsnc.yun.ws.service.InternetUserService;
import com.shsnc.yun.ws.service.ProductOrderTrendService;
import com.shsnc.yun.ws.service.UserIndustryService;
import com.shsnc.yun.ws.utils.JsonUtils;

@Controller
public class WebServiceController {

	@Resource
	private CustomerProvinceService customerProvinceService;

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

	@ResponseBody
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mav = null;
		List<String> list = null;

		try {
			list = new ArrayList<String>();

			List<CustomerProvince> infoList = customerProvinceService.listProvince();
			List<Object> customertrendsList = customertrendsService.listCustomertrends();
			List<GroupUser> groupUserList = groupUserService.listGroupUser();
			List<InternetUser> internetUserList = internetUserService.listInternetUser();
			List<Object> productOrderTrendList = productOrderTrendService.listProductOrderTrend();
			List<UserIndustry> userIndustryList = userIndustryService.listUserIndustry();
			List<Object> capacityManagementList = capacityManagementService.listCapacityManagement();

			Object object = JsonUtils.toJSON(infoList, false);
			Object customertrendsObj = JsonUtils.toJSON(customertrendsList, false);
			Object groupUserObj = JsonUtils.toJSON(groupUserList, false);
			Object internetUserObj = JsonUtils.toJSON(internetUserList, false);
			Object productOrderTrendObj = JsonUtils.toJSON(productOrderTrendList, false);
			Object userIndustryObj = JsonUtils.toJSON(userIndustryList, false);
			Object capacityManagementObj = JsonUtils.toJSON(capacityManagementList, false);

			list.add("客户发展趋势:各省份客户数据——————" + object.toString());
			list.add("客户发展趋势——————" + customertrendsObj.toString());
			list.add("产品订购情况:集团客户——————" + groupUserObj.toString());
			list.add("产品订购情况:互联网客户——————" + internetUserObj.toString());
			list.add("产品订购趋势——————" + productOrderTrendObj.toString());
			list.add("客户行业分布——————" + userIndustryObj.toString());
			list.add("容量管理——————" + capacityManagementObj.toString());
			
			
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
