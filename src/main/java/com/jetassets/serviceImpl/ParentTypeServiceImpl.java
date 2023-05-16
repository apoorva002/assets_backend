package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.ParentType;
import com.jetassets.repository.ParentTypeRepository;
import com.jetassets.service.ParentTypeService;

@Service
public class ParentTypeServiceImpl implements ParentTypeService {
	
	
	@Autowired
	private ParentTypeRepository parentTypeRepository;
	

	@Override
	public ParentType create(ParentType parentType) {
		
		return parentTypeRepository.save(parentType);
	}

	@Override
	public List<ParentType> getAll() {
		
		return parentTypeRepository.findAll();
	}

	@Override
	public Optional<ParentType> getById(long id) {
		
		return parentTypeRepository.findById(id);
	}

	@Override
	public ParentType update(ParentType parentType, long id) {
		ParentType existingDetails=parentTypeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("ParentType", "Id",id));
		existingDetails.setName(parentType.getName());
		return parentTypeRepository.save(existingDetails);
	}

	@Override
	public void delete(long id) {
		parentTypeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", id));
		parentTypeRepository.deleteById(id);
	}

}
