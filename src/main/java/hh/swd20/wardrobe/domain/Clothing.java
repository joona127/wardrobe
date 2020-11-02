package hh.swd20.wardrobe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Clothing {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	private String description;
	private int year;
	private double price;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "typeid")
	private Type type;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "ownerid")
	private Owner owner;
	
	public Clothing () {
		
	}
	
	public Clothing (String description, int year, double price) {
		super();
		this.description = description;
		this.year = year;
		this.price = price;
		
	}
	
	public Clothing (String description, int year, double price, Type type, Owner owner) {
		super();
		this.description = description;
		this.year = year;
		this.price = price;
		this.type = type;
		this.owner = owner;
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
	

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Clothing [id=" + id + ", description=" + description + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	
}
