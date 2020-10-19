package com.ecoaccumulation.eco.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoaccumulation.eco.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}