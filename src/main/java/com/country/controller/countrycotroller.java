package com.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.country.entity.country;
import com.country.service.countryServicee;

@RestController
public class countrycotroller {
	@Autowired
	 
	private countryServicee countryservice;
	
	@GetMapping("/list-country")
	public List<country> getList(){
		return countryservice.getAllList();
		
	}
	@GetMapping("/{id}")
	public country getById(@PathVariable Long id) {
		return countryservice.getById(id); 
	}

}
