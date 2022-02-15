package com.agri.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.agri.models.Dealer;


@Repository
public interface DealerRepository  extends MongoRepository <Dealer,String>{

	

}
