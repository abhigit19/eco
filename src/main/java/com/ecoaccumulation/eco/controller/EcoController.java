package com.ecoaccumulation.eco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoaccumulation.eco.Entity.ZoneData;
import com.ecoaccumulation.eco.service.impl.ZoneService;

@RestController
public class EcoController {
	
	@Autowired 
	ZoneService zoneService;
	
	@GetMapping("/getZoneData")
	public List<ZoneData> getResult() {
		return zoneService.getAllZoneData();
	}

}
