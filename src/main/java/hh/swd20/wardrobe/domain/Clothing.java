package hh.swd20.wardrobe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Clothing {

	private Long id;
	private String description;
	private int year;
	private double price;
	
	public Clothing () {
		
	}
	
	public Clothing (String description, int year, double price) {
		super();
		this.description = description;
		this.year = year;
		this.price = price;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Clothing [id=" + id + ", description=" + description + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	
}
