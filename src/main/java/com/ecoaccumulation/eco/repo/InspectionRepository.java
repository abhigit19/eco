package com.ecoaccumulation.eco.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.Inspection;
import com.ecoaccumulation.eco.Entity.ZoneData;

@Repository
public interface InspectionRepository extends JpaRepository<Inspection, Long> {
}