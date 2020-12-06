package com.ecoaccumulation.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.Inspection;
import com.ecoaccumulation.eco.Entity.ZoneData;
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
	
	@GetMapping("/getZoneData")
	public List<ZoneData> getZoneData() {
		return zoneService.getAllZoneData();
	}

	@GetMapping("/getCleanlinessDrive")
	public List<CleanlinessDrive> getCleanlinessDrive() {
		return cleanlinessDriveService.getAllCleaninessDriveData();
	}
	
	@GetMapping("/inspection")
	public List<Inspection> getInspectionData() {
		return inspectionService.getAllInspectionData();
	}
}
