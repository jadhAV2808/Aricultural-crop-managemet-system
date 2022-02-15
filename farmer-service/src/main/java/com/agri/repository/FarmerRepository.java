package com.agri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.agri.models.Farmer;

@Repository
public interface FarmerRepository  extends MongoRepository<Farmer,Integer>{
	
	
	

}
