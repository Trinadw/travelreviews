package org.wecancodeit.travel;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	//instance variables
	@Id
	@GeneratedValue
	private long id;
	
	public String countryName;

	@OneToMany(mappedBy = "country")
	private Set<City> cities;
	
	public String getCountryName() {
		return countryName;
	}

	public Country(String countryName) {
		this.countryName = countryName;
	}

	public long getId() {
		return id;
	}
	//empty JPA constructor
	private Country(){}

	public Set<City> getCities() {
		return cities;
	}
	

	
}
