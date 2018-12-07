package com.ws.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.CapacityManagementDao;
import com.ws.entity.CapacityManagement;
import com.ws.service.CapacityManagementService;
import com.ws.utils.TransformationUtils;

@Service("capacityManagementService")
public class CapacityManagementServiceImpl implements CapacityManagementService {
	
	@Autowired
	private CapacityManagementDao capacityManagementDao;

	public List<Object> listCapacityManagement() {
		List<Object> list = new ArrayList<Object>();
		list.add(this.southNode());
		return list;
	}
	
	private Map<String,Object> southNode(){
		Map<String, Integer> machinMap = new HashMap<String, Integer>();
		Map<String, Integer> storageMap = new HashMap<String, Integer>();
		Map<String, Integer> networkMap = new HashMap<String, Integer>();
		Map<String, Object> capacityMap = new HashMap<String, Object>();
		
		CapacityManagement machinData = capacityManagementDao.machin();
		Integer cpu = machinData.getCpu();
		Integer usedCpu = machinData.getUcpu();
		Integer usableCpu = cpu-usedCpu;
		machinMap.put("cpu", cpu);
		machinMap.put("usedCpu", usedCpu);
		machinMap.put("usableCpu", usableCpu);
		Integer memory = machinData.getMem();
		Integer usedMemory = machinData.getUmem();
		Integer usableMemory = memory-usedMemory;
		machinMap.put("memory", memory);
		machinMap.put("usedMemory", usedMemory);
		machinMap.put("usableMemory", usableMemory);
		Integer disk = machinData.getDisk();
		Integer udisk = machinData.getUdisk();
		Integer usableDisk = disk - udisk;
		machinMap.put("disk", disk);
		machinMap.put("udisk", udisk);
		machinMap.put("usableMemory", usableDisk);
		capacityMap.put("compute", machinMap);
		
		CapacityManagement storageData = capacityManagementDao.storage();
		Integer pbs = TransformationUtils.gbTurnTb(storageData.getPbs());
		Integer usedPbs = TransformationUtils.gbTurnTb(storageData.getUpbs());
		Integer usablePbs = pbs - usedPbs;
		storageMap.put("pbs", pbs);
		storageMap.put("usedPbs", usedPbs);
		storageMap.put("usablePbs", usablePbs);
		Integer cbs = TransformationUtils.byteTurnTb(storageData.getCbs());
		Integer usedCbs = TransformationUtils.byteTurnTb(storageData.getUcbs());
		Integer usableCbs = cbs - usedCbs;
		storageMap.put("cbs", cbs);
		storageMap.put("usedCbs", usedCbs);
		storageMap.put("usableCbs", usableCbs);
		Integer webdisk = storageData.getWebdisk();
		Integer usedWebdisk = TransformationUtils.gbTurnTb(storageData.getUwebdisk());
		Integer usableWebdisk = webdisk - usedWebdisk;
		storageMap.put("webdisk", webdisk);
		storageMap.put("usedWebdisk", usedWebdisk);
		storageMap.put("usabelWebdisk", usableWebdisk);
		Integer obs = TransformationUtils.gbTurnTb(storageData.getObs());
		Integer usedObs = TransformationUtils.gbTurnTb(storageData.getUobs());
		Integer usableObs = obs - usedObs;
		storageMap.put("obs", obs);
		storageMap.put("usedObs", usedObs);
		storageMap.put("usableObs", usableObs);
		capacityMap.put("storage", storageMap);
		
		CapacityManagement networkData = capacityManagementDao.network();
		Integer bandwidth = networkData.getBandwidth();
		Integer usedBandwidth = TransformationUtils.kbpsTurnGbps(networkData.getUbandwidth());
		Integer usablebandwidth = bandwidth - usedBandwidth;
		networkMap.put("bandwidth",bandwidth);
		networkMap.put("usedBandwidth", usedBandwidth);
		networkMap.put("usableBandwidth", usablebandwidth);
		Integer pubip = networkData.getPubip();
		Integer usedPubip = networkData.getUpubip();
		Integer usablePubip = pubip - usedPubip;
		networkMap.put("pubip", pubip);
		networkMap.put("usedPubip", usedPubip);
		networkMap.put("usablePubip", usablePubip);
		Integer elb = networkData.getElb();
		Integer usedElb = networkData.getUelb();
		Integer usableElb = elb - usedElb;
		networkMap.put("elb", elb);
		networkMap.put("usedElb", usedElb);
		networkMap.put("usableElb", usableElb);
		capacityMap.put("network", networkMap);
		
		return capacityMap;
	}
 
	
}
