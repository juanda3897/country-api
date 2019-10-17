package com.country.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.entity.country;
import com.country.repository.countryRepository;
import com.country.service.countryServicee;

@Service
public class countryService implements countryServicee {
	@Autowired
	private countryRepository CountryRepository;
	
	@Override
	public List<country> getAllList(){
		return CountryRepository.findAll();
		
	}
	@Override
	public country getById (Long id){
		return CountryRepository.findById(id).get();
		

}
}
