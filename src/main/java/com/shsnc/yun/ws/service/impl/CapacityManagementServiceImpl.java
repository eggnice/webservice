package com.shsnc.yun.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsnc.yun.ws.dao.CapacityManagementDao;
import com.shsnc.yun.ws.entity.CapacityManagement;
import com.shsnc.yun.ws.service.CapacityManagementService;
import com.shsnc.yun.ws.utils.HexTransformationUtils;

@Service("capacityManagementService")
public class CapacityManagementServiceImpl implements CapacityManagementService {
	
	@Autowired
	private CapacityManagementDao capacityManagementDao;

	public List<Object> listCapacityManagement() {
		List<Object> list = new ArrayList<Object>();
		list.add(this.southChina());
		list.add(this.northChina());
		
		return list;
	}
	
	private Map<String,Object> northChina(){
		Map<String, Integer> northMap = new HashMap<String, Integer>();
		Map<String, Object> northChinaMap = new HashMap<String, Object>();
		
		List<CapacityManagement> northCpuMem = capacityManagementDao.northCpuMem();
		
		Integer cpu = northCpuMem.get(0).getCpu()+northCpuMem.get(1).getCpu();
		Integer useCpu = northCpuMem.get(0).getUcpu()+northCpuMem.get(1).getUcpu();
		Integer useableCpu = cpu-useCpu;
		northMap.put("useCpu", useCpu);
		northMap.put("useableCpu", useableCpu);
		
		Integer memory = northCpuMem.get(0).getMem()+northCpuMem.get(1).getMem();
		Integer useMemory = northCpuMem.get(0).getUmem()+northCpuMem.get(1).getUmem();
		Integer usableMemory = memory-useMemory;
		northMap.put("useMemory", useMemory);
		northMap.put("usableMemory", usableMemory);
		
		CapacityManagement northCbsPbsObs = capacityManagementDao.northCbsPbsObs();
		CapacityManagement northUseCbsPbsObs = capacityManagementDao.northUseCbsPbsObs();
		
		Integer cbs = HexTransformationUtils.byteTurnTb(Long.parseLong(northCbsPbsObs.getCbs()));
		Integer useCbs = HexTransformationUtils.byteTurnTb(Long.parseLong(northUseCbsPbsObs.getUcbs()));
		Integer usableCbs = cbs-useCbs;
		northMap.put("useCbs", useCbs);
		northMap.put("usableCbs", usableCbs);
		
		Integer pbs = HexTransformationUtils.gbTurnTb(Integer.valueOf(northCbsPbsObs.getPbs()));
		Integer usePbs = HexTransformationUtils.gbTurnTb(Integer.valueOf(northUseCbsPbsObs.getUpbs()));
		Integer usablePbs = pbs-usePbs;
		northMap.put("usePbs", usePbs);
		northMap.put("usablePbs", usablePbs);
		
		Integer obs = HexTransformationUtils.byteTurnTb(Long.parseLong(northCbsPbsObs.getObs()));
		Integer useObs = HexTransformationUtils.byteTurnTb(Long.parseLong(northUseCbsPbsObs.getUobs()));
		Integer usableObs = obs-useObs;
		northMap.put("useObs", useObs);
		northMap.put("usableObs", usableObs);
		
		CapacityManagement northBandwidthIp = capacityManagementDao.northBandwidthIp();
		CapacityManagement northUseBandwidthIp = capacityManagementDao.northUseBandwidthIp();
		
		Integer bandwidth = northBandwidthIp.getBandwidth();
		Integer useBandwidth = HexTransformationUtils.kbTurnGb(northUseBandwidthIp.getUbandwidth());
		Integer usableBandwidth = bandwidth-useBandwidth;
		northMap.put("useBandwidth", useBandwidth);
		northMap.put("usableBandwidth", usableBandwidth);
		
		Integer ip = northBandwidthIp.getPubip();
		Integer useIp = northUseBandwidthIp.getUpubip();
		Integer usableIp = ip-useIp;
		northMap.put("useIp", useIp);
		northMap.put("usableIp", usableIp);
		
		northChinaMap.put("node", "华北节点");
		northChinaMap.put("data", northMap);
		
		return northChinaMap;
	}
	
	private Map<String,Object> southChina(){
		Map<String, Integer> southMap = new HashMap<String, Integer>();
		Map<String, Object> sourceChinaMap = new HashMap<String, Object>();
		
		List<CapacityManagement> southCpuMem = capacityManagementDao.southCpuMem();
		
		Integer cpu = southCpuMem.get(0).getCpu()+southCpuMem.get(1).getCpu();
		Integer useCpu = southCpuMem.get(0).getUcpu()+southCpuMem.get(1).getUcpu();
		Integer useableCpu = cpu-useCpu;
		southMap.put("useCpu", useCpu);
		southMap.put("useableCpu", useableCpu);
		
		Integer memory = southCpuMem.get(0).getMem()+southCpuMem.get(1).getMem();
		Integer useMemory = southCpuMem.get(0).getUmem()+southCpuMem.get(1).getUmem();
		Integer usableMemory = memory-useMemory;
		southMap.put("useMemory", useMemory);
		southMap.put("usableMemory", usableMemory);
	
		CapacityManagement southCbsPbs = capacityManagementDao.southCbsPbs();
		CapacityManagement southUseCbsPbs = capacityManagementDao.southUseCbsPbs();
		CapacityManagement southObs = capacityManagementDao.southObs();
		
		Integer cbs = HexTransformationUtils.byteTurnTb(Long.parseLong(southCbsPbs.getCbs()));
		Integer useCbs = HexTransformationUtils.byteTurnTb(Long.parseLong(southUseCbsPbs.getUcbs()));
		Integer usableCbs = cbs-useCbs;
		southMap.put("useCbs", useCbs);
		southMap.put("usableCbs", usableCbs);
		
		Integer pbs = HexTransformationUtils.gbTurnTb(Integer.valueOf(southCbsPbs.getPbs()));
		Integer usePbs = HexTransformationUtils.gbTurnTb(Integer.valueOf(southUseCbsPbs.getUpbs()));
		Integer usablePbs = pbs-usePbs;
		southMap.put("usePbs", usePbs);
		southMap.put("usablePbs", usablePbs);
		
		Integer obs = HexTransformationUtils.gbTurnTb(Integer.valueOf(southObs.getObs()));
		Integer useObs = HexTransformationUtils.gbTurnTb(Integer.valueOf(southObs.getUobs()));
		Integer usableObs = obs-useObs;
		southMap.put("useObs", useObs);
		southMap.put("usableObs", usableObs);

		CapacityManagement southBandwidthIp = capacityManagementDao.southBandwidthIp();
		CapacityManagement southUseBandwidthIp = capacityManagementDao.southUseBandwidthIp();
		
		Integer bandwidth = southBandwidthIp.getBandwidth();
		Integer useBandwidth = HexTransformationUtils.kbTurnGb(southUseBandwidthIp.getUbandwidth());
		Integer usableBandwidth = bandwidth-useBandwidth;
		southMap.put("useBandwidth", useBandwidth);
		southMap.put("usableBandwidth", usableBandwidth);
		
		Integer ip = southBandwidthIp.getPubip();
		Integer useIp = southUseBandwidthIp.getUpubip();
		Integer usableIp = ip-useIp;
		southMap.put("useIp", useIp);
		southMap.put("usableIp", usableIp);
		
		sourceChinaMap.put("node", "华南节点");
		sourceChinaMap.put("data", southMap);
		
		return sourceChinaMap;
	}
 
	
}
