package com.ecoaccumulation.eco.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;

@Repository
public interface CleaningRepository extends JpaRepository<CleanlinessDrive, Long> {
	
	@Query("SELECT t FROM CleanlinessDrive t WHERE t.zoneData.zoneId = ?1")
	 List<CleanlinessDrive> findByZoneId(long zoneId);
}