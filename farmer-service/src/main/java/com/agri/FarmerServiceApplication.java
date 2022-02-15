package com.agri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableEurekaClient
public class FarmerServiceApplication  implements CommandLineRunner{
	
//	@Autowired
//	public FarmerServiceApplication(FarmerRepository farmerRepo) {
//		this.farmerRepo=farmerRepo;
//	}

	public static void main(String[] args) {
		SpringApplication.run(FarmerServiceApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
}

	

}
