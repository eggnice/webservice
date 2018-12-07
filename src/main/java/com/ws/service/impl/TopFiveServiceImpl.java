package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.TopFiveDao;
import com.ws.entity.TopFive;
import com.ws.service.TopFiveService;

@Service("topFiveService")
public class TopFiveServiceImpl implements TopFiveService {
	
	@Autowired
	private TopFiveDao topFiveDao;

	public List<Object> listTopFive() {
		List<Object> list = new ArrayList<Object>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
	
		List<TopFive> computeData = topFiveDao.listComputeTopFive();
		Map<Integer,Object > computeResultMap = new HashMap<Integer, Object>();
		for (int i=0; i<computeData.size(); i++) {
			Map<String, String> computeMap = new HashMap<String, String>();
			computeMap.put("cpu", computeData.get(i).getCpu());
			computeMap.put("ram", computeData.get(i).getRam());
			computeMap.put("orders", computeData.get(i).getTotal());
			computeMap.put("product", computeData.get(i).getProduct());
			computeResultMap.put(i+1, computeMap);
		}
		list.add(computeResultMap);
		
		List<TopFive> diskData = topFiveDao.listDiskTopFive();
		Map<Integer,Object > diskResultMap = new HashMap<Integer, Object>();
		for (int d=0; d<diskData.size(); d++) {
			Map<String, String> diskMap = new HashMap<String, String>();
			diskMap.put("type", diskData.get(d).getProduct());
			diskMap.put("specifications", diskData.get(d).getResult());
			diskMap.put("orders", diskData.get(d).getTotal());
			diskMap.put("product", diskData.get(d).getProduct());
			diskResultMap.put(d+1, diskMap);
		}
		list.add(diskResultMap);
		
		List<List> L = new ArrayList<List>();
		L.add(topFiveDao.listCloudSpaceTopFive());
		L.add(topFiveDao.listBandwidthTopFive());
		for (int one=0; one<L.size();one++) {
			Map<Integer,Object> tmpResultMap = new HashMap<Integer, Object>();
			for (int row=0; row<L.get(one).size(); row++) {
				Map<String,String> tmpMap = new HashMap<String,String>();
				tmpMap.put("specifications",((TopFive) L.get(one).get(row)).getResult());
				tmpMap.put("orders",((TopFive) L.get(one).get(row)).getTotal());
				tmpMap.put("product",((TopFive) L.get(one).get(row)).getProduct());				
				tmpResultMap.put(row+1, tmpMap);
			}
			list.add(tmpResultMap);
		}
		
		return list;
	}

}
