package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.Accessory;
import com.jetassets.model.AssetType;
import com.jetassets.repository.AssetTypeRepository;
import com.jetassets.service.AssetTypeService;

@Service
public class AssetTypeServiceImpl implements AssetTypeService {
	
	@Autowired
	private AssetTypeRepository assetTypeRepository;

	@Override
	public AssetType create(AssetType assetType) {
		
		return assetTypeRepository.save(assetType) ;
	}

	@Override
	public List<AssetType> getAllAssetType() {
		// TODO Auto-generated method stub
		return assetTypeRepository.findAll();
	}

	@Override
	public Optional<AssetType> getById(long id) {
		
		return assetTypeRepository.findById(id);
	}

	@Override
	public AssetType update(AssetType assetType, long id) {
		AssetType existingAccessory = assetTypeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("AssetType", "Id", id));
		existingAccessory.setName(assetType.getName());
		return assetTypeRepository.save(existingAccessory);
		
	}

	@Override
	public void delete(long id) {
		assetTypeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", id));
		assetTypeRepository.deleteById(id);
		
	
	}

}
