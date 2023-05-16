package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.Accessory;
import com.jetassets.model.Asset;
import com.jetassets.repository.AssetRepository;
import com.jetassets.service.AssetService;


@Service
public class AssetServiceImpl implements AssetService {
	
	@Autowired
	private AssetRepository assetRepository;

	@Override
	public Asset create(Asset asset) {
		
		return assetRepository.save(asset);
	}

	@Override
	public List<Asset> getAll() {
		
		return assetRepository.findAll();
	}

	@Override
	public Optional<Asset> getById(long id) {
		
		return assetRepository.findById(id);
	}

	@Override
	public Asset update(Asset asset, long id) {
		Asset existingAssets = assetRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Asset", "Id", id));
		existingAssets.setName(asset.getName());
		return assetRepository.save(existingAssets);
		
	}

	@Override
	public void delete(long id) {
		assetRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", id));
		assetRepository.deleteById(id);
		
	}

}
