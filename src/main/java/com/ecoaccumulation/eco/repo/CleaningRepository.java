package com.ecoaccumulation.eco.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoaccumulation.eco.Entity.CleanlinessDrive;
import com.ecoaccumulation.eco.Entity.ZoneData;

@Repository
public interface CleaningRepository extends JpaRepository<CleanlinessDrive, Long> {
}