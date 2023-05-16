package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.Accessory;
import com.jetassets.repository.AccessoryRepository;
import com.jetassets.service.AccessoryService;


@Service
public class AccessoryServiceImpl implements AccessoryService {
	
	@Autowired
	private AccessoryRepository accessoryRepository;

	@Override
	public Accessory create(Accessory accessory) {
		
		return accessoryRepository.save(accessory) ;
	}

	@Override
	public List<Accessory> getAllAccessory() {
		
		  return accessoryRepository.findAll();
	}

	@Override
	public Optional<Accessory> getById(long id) {
		
		return accessoryRepository.findById(id);
	}

	@Override
	public Accessory update(Accessory accessory, long id) {
		Accessory existingAccessory = accessoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Accessory", "Id", id));
		existingAccessory.setName(accessory.getName());
		return accessoryRepository.save(existingAccessory);
		
	}

	@Override
	public void delete(long id) {
		accessoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Accessory", "Id", id));
		accessoryRepository.deleteById(id);
		
		
	}

}
