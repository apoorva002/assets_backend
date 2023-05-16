package com.jetassets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AssetType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="asset_type_id")
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
	@Override
	public String toString() {
		return "AssetType [id=" + id + ", name=" + name + "]";
	}
	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssetType(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
    

}
