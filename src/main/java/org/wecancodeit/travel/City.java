package org.wecancodeit.travel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue
	private long id;
	
	private String cityName;
	private String imageUrl;
	private String visitDate;
	@Lob
	private String review;
	@Lob
	private String description;
	
	@ManyToOne
	private Country country; //foriegn key
	
	public long getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public String getReview() {
		return review;
	}

	public String getDescription() {
		return description;
	}

	public Country getCountry() {
		return country;
	}

	public City(String cityName, String imageUrl, String visitDate, String review, String description,
			Country country) {
		this.cityName = cityName;
		this.imageUrl = imageUrl;
		this.visitDate = visitDate;
		this.review = review;
		this.description = description;
		this.country = country;
	}
	public City(){}
	
}
