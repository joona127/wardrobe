package hh.swd20.wardrobe.domain;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;


public class Owner {

	private Long ownerid;
	private String name;
	
	public Owner () {
		
	}
	
	public Owner (String name) {
		super();
		this.name = name;
	}

	public Long getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Long ownerid) {
		this.ownerid = ownerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Owner [id=" + ownerid + ", name=" + name + "]";
	}
	
	
}
