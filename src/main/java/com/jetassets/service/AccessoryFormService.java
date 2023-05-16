package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.AccessoryForm;
public interface AccessoryFormService {
	 public AccessoryForm create(AccessoryForm accessoryForm);
	   public List<AccessoryForm> getAll();
	   public Optional<AccessoryForm> getById(long id);
	   public AccessoryForm update(AccessoryForm accessoryForm, long id);
	   public void delete(long id);
	

}
