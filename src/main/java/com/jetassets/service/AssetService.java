package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.Asset;



public interface AssetService {
	
	 public Asset create(Asset asset);
	   public List<Asset> getAll();
	   public Optional<Asset> getById(long id);
	   public Asset update(Asset asset, long id);
	   public void delete(long id);
	

}
