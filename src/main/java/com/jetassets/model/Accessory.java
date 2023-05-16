package com.jetassets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="accessoryid")
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Accessory(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Accessory() {
		
		
	}
	@Override
	public String toString() {
		return "Accessory [id=" + id + ", name=" + name + "]";
	}


	

}
