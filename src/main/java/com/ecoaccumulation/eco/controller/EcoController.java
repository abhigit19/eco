package com.ecoaccumulation.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.Inspection;
import com.ecoaccumulation.eco.Entity.ZoneData;
import com.ecoaccumulation.eco.service.impl.CleanAndMessiestCityService;
import com.ecoaccumulation.eco.service.impl.CleanlinessDriveService;
import com.ecoaccumulation.eco.service.impl.InspectionService;
import com.ecoaccumulation.eco.service.impl.ZoneService;

@RestController
public class EcoController {
	
	@Autowired 
	ZoneService zoneService;
	
	@Autowired 
	CleanlinessDriveService cleanlinessDriveService;

	@Autowired 
	InspectionService inspectionService;
	

	@Autowired 
	CleanAndMessiestCityService cleanAndMessiestCityService;
	
	@GetMapping("/ZoneData")
	public List<ZoneData> getZoneData() {
		return zoneService.getAllZoneData();
	}

	@GetMapping("/CleanlinessDrive")
	public List<CleanlinessDrive> getCleanlinessDrive() {
		return cleanlinessDriveService.getAllCleaninessDriveData();
	}
	
	@GetMapping("/inspection")
	public List<Inspection> getInspectionData() {
		return inspectionService.getAllInspectionData();
	}
	
	@GetMapping("/bestCleanCity")
	public ZoneData getBestCleanCity() {
		 return cleanAndMessiestCityService.getCleanistCity();
	}
	
	@GetMapping("/worstCleanCity")
	public ZoneData getWorstCleanCity() {
		return cleanAndMessiestCityService.getWorstCity();
	}
}
