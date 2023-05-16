package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.AssetType;


public interface AssetTypeService {
	
	   public AssetType create(AssetType assetType);
	   public List<AssetType> getAllAssetType();
	   public Optional<AssetType> getById(long id);
	   public AssetType update(AssetType assetType, long id);
	   public void delete(long id);
	

}
