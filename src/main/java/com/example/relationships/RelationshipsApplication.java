package com.example.relationships;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.relationships.manytomany.Company;
import com.example.relationships.manytomany.CompanyRepository;
import com.example.relationships.manytomany.Domain;

@SpringBootApplication
public class RelationshipsApplication implements CommandLineRunner{

	
	@Autowired
	CompanyRepository companyRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RelationshipsApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception
	{
		
		Domain d1 = new Domain("Java");
		Domain d2 = new Domain("Spring");
		
		System.out.println(d1);
		Company company = new Company("Path Infotech");
		
		  company.getDomains().add(d1);
		  d1.getCompanies().add(company);
		  d2.getCompanies().add(company);
		
		companyRepository.save(company);
		
	}

}
