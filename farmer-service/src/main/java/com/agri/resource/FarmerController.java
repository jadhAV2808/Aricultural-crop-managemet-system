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

import com.agri.models.Farmer;
import com.agri.repository.FarmerRepository;

@RestController
public class FarmerController {
	
	@Autowired
	FarmerRepository farmerRepo;
	
	@PostMapping("/addfarmer")
	public String saveFarmer(@RequestBody Farmer farmer) {
		farmerRepo.save(farmer);
		return "farmer added with id: "+farmer.getId();
	}
	
	@GetMapping("/getallfarmer")
	public List<Farmer> getFarmers(){
		return  farmerRepo.findAll();
	}
	
	@GetMapping("/getfarmer/{Id}")
	public Optional<Farmer> getFarmer(@PathVariable int Id){
		return farmerRepo.findById(Id);
	}
	
	@DeleteMapping("/deletefarmer/{Id}")
	public String deleteFarmer(@PathVariable int Id){
		 farmerRepo.deleteById(Id);
		 return "farmer deleted from the list with id :" +Id;
	}
	

}
