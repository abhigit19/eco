package com.ecoaccumulation.eco.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.ZoneData;
import com.ecoaccumulation.eco.repo.CleaningRepository;
import com.ecoaccumulation.eco.repo.ZoneRepository;

@Service
public class CleanAndMessiestCityService {

	@Autowired
	private CleanlinessDriveService driveService;

	@Autowired
	private ZoneService zoneService;

	public ZoneData getCleanistCity() {
	//	Map<Long,String > mapEPercent= zoneService.getAllZoneData().stream().collect(Collectors.toMap(x->((ZoneData) x).getZoneId(), y ->  driveService.findByZone(y.getZoneId()).get(0).getExpectedPercent()));
	//	mapEPercent.forEach((K,V) -> System.out.println(K + ", mapEPercent : " + V));	
		return zoneService.getAllZoneData().get(2);
	}

	public ZoneData getWorstCity() {
		return zoneService.getAllZoneData().get(4);
	}
}