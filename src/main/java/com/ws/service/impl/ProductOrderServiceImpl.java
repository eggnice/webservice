package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.ProductOrderDao;
import com.ws.entity.ProductOrder;
import com.ws.service.ProductOrderService;

@Service("productOrderService")
public class ProductOrderServiceImpl implements ProductOrderService {
	
	@Autowired
	private ProductOrderDao productOrderDao;

	public List<Object> listProductOrder() {
		List<Object> list = new ArrayList<Object>();
		List<String> poolList = Arrays.asList("CIDC-RP-00","CIDC-RP-01","CIDC-RP-02",
				"CIDC-RP-03","CIDC-RP-04","CIDC-RP-07");
		//List<String> poolName = Arrays.asList("全局资源池","华南节点1","华南节点2","华北节点1",
		//		"云南节点", "华中节点1");
		//Map<String, Object> resultMap = new HashMap<String, Object>();
		
		for (int i=0; i<poolList.size(); i++) {
			List<ProductOrder> poolDataList = productOrderDao.listProductOrder(
					poolList.get(i));
			for (int k=0; k<poolDataList.size(); k++) {
				list.add(poolDataList.get(k));
			}
		}
		return list;
	}

}
