package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.AccessoryForm;
import com.jetassets.model.AssetAssignment;

public interface AssetAssignmentService {
	
	public AssetAssignment create(AssetAssignment assetAssignment);
	   public List<AssetAssignment> getAll();
	   public Optional<AssetAssignment> getById(long id);
	   public AssetAssignment update(AssetAssignment assetAssignment, long id);
	   public void delete(long id);
	

}
