package com.agri.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agri.models.Dealer;

import com.agri.repository.DealerRepository;

@RestController
public class DealerController {
	
	
	@Autowired
	DealerRepository dealerRepo;
	
	

	@PostMapping("/adddealer")
	public String saveFarmer(@RequestBody Dealer dealer) {
		dealerRepo.save(dealer);
		return "dealer added with name: "+dealer.getDealername();
	}
	
	
	@GetMapping("/getalldealer")
	public List<Dealer> getFarmers(){
		return  dealerRepo.findAll();
	}
	
//	@GetMapping("/getfarmer/{dealername}")
//	public Optional<Dealer> getFarmer(@PathVariable String dealername){
//		return dealerRepo.findByName(dealername);
//	}
	
	
	
}
