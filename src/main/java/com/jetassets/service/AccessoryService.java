package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.Accessory;



public interface AccessoryService {
	   public Accessory create(Accessory accessory);
	   public List<Accessory> getAllAccessory();
	   public Optional<Accessory> getById(long id);
	   public Accessory update(Accessory accessory, long id);
	   public void delete(long id);
	

}
