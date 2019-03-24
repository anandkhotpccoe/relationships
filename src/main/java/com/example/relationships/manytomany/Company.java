package com.example.relationships.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;
	
	
	
	
	@NotNull
	@Size(max = 70)
	private String name;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "company_domains", joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns = @JoinColumn(name ="domain_id"))
	private Set<Domain> domains = new HashSet<>();


	public Long getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Domain> getDomains() {
		return domains;
	}


	public void setDomains(Set<Domain> domains) {
		this.domains = domains;
	}

	/*
	 * @Override public String toString() { return "Company [companyId=" + companyId
	 * + ", name=" + name + "]"; }
	 */


	public Company(@NotNull @Size(max = 70) String name) {
		this.name = name;
	}


	public Company() {
		super();
	}
	
	
	
	
	

}
