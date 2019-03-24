package com.example.relationships.manytomany;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Domain {

	
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	@ManyToMany(mappedBy = "domains", fetch = FetchType.LAZY)
	private Set<Company> companies = new HashSet<>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Company> getCompanies() {
		return companies;
	}


	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}


	@Override
	public String toString() {
		return "Domain [id=" + id + ", name=" + name + ", companies=" + companies + "]";
	}


	public Domain( String name) {
		this.name = name;
	}


	public Domain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
