package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.AccessoryForm;
import com.jetassets.repository.AccessoryFormRepository;
import com.jetassets.repository.AccessoryRepository;
import com.jetassets.service.AccessoryFormService;


@Service
public class AccessoryFormServiceImpl implements AccessoryFormService {
	
	@Autowired
	private AccessoryFormRepository accessoryFormRepository;

	@Override
	public AccessoryForm create(AccessoryForm accessoryForm) {
		return accessoryFormRepository.save(accessoryForm);
	}

	@Override
	public List<AccessoryForm> getAll() {
		return accessoryFormRepository.findAll();
	}

	@Override
	public Optional<AccessoryForm> getById(long id) {
		System.out.println(accessoryFormRepository.findById(id));
		return accessoryFormRepository.findById(id);
	}

	@Override
	public AccessoryForm update(AccessoryForm accessoryForm, long id) {
		
		AccessoryForm exitingaccessoryForm=accessoryFormRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("AccessoryForm","Id",id));
		exitingaccessoryForm.setBillDocument(accessoryForm.getBillDocument());
		exitingaccessoryForm.setBillNo(accessoryForm.getBillNo());
		exitingaccessoryForm.setDescription(accessoryForm.getBillNo());
		exitingaccessoryForm.setName(accessoryForm.getName());
		exitingaccessoryForm.setPurchaseDate(accessoryForm.getPurchaseDate());
		exitingaccessoryForm.setPurchaseQuantity(accessoryForm.getPurchaseQuantity());
		exitingaccessoryForm.setSkuNumber(accessoryForm.getSkuNumber());
		exitingaccessoryForm.setType(accessoryForm.getType());
		exitingaccessoryForm.setUnitCost(accessoryForm.getUnitCost());
		exitingaccessoryForm.setVendor(accessoryForm.getVendor());
		return accessoryFormRepository.save(exitingaccessoryForm);
		
	}

	@Override
	public void delete(long id) {
		accessoryFormRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AccessoryForm", "Id", id));
		accessoryFormRepository.deleteById(id);
		
		
	}

}
