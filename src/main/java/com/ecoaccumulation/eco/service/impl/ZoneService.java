package com.ecoaccumulation.eco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecoaccumulation.eco.Entity.ZoneData;

import com.ecoaccumulation.eco.repo.ZoneRepository;

@Service
public class ZoneService {

	@Autowired
	private ZoneRepository zoneRepository;

	public List<ZoneData> getAllZoneData() {
		return zoneRepository.findAll();
	}
}