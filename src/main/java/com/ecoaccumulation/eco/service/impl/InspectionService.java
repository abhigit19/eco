package com.ecoaccumulation.eco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.Inspection;
import com.ecoaccumulation.eco.Entity.ZoneData;
import com.ecoaccumulation.eco.repo.CleaningRepository;
import com.ecoaccumulation.eco.repo.InspectionRepository;
import com.ecoaccumulation.eco.repo.ZoneRepository;

@Service
public class InspectionService {

	@Autowired
	private InspectionRepository inspectionRepository;

	public List<Inspection> getAllInspectionData() {
		return inspectionRepository.findAll();
	}
}