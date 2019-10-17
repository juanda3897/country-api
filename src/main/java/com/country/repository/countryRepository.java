package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.country.entity.country;

public interface countryRepository extends JpaRepository <country , Long> {
	

}
