package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.Accessory;
import com.jetassets.model.AccessoryIssue;

import com.jetassets.repository.AccessoryIssueRepository;
import com.jetassets.service.AccessoryIssueService;


@Service
public class AccessoryIssueServiceImpl implements AccessoryIssueService {
	
	
	@Autowired
	private AccessoryIssueRepository accessoryissueRepository;

	@Override
	public AccessoryIssue create(AccessoryIssue accessoryIssue) {
		// TODO Auto-generated method stub
		return accessoryissueRepository.save(accessoryIssue);
	}

	@Override
	public List<AccessoryIssue> getAll() {
		
		return accessoryissueRepository.findAll();
	}

	@Override
	public Optional<AccessoryIssue> getById(long id) {
		// TODO Auto-generated method stub
		return accessoryissueRepository.findById(id);
	}

	@Override
	public AccessoryIssue update(AccessoryIssue accessoryIssue, long id) {
		AccessoryIssue existingAccessoryIssue = accessoryissueRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("AccessoryIssue", "Id", id));
		existingAccessoryIssue.setAccessoryId(accessoryIssue.getAccessoryId());
		existingAccessoryIssue.setEmployeeId(accessoryIssue.getEmployeeId());
		existingAccessoryIssue.setIssueDate(accessoryIssue.getIssueDate());
		existingAccessoryIssue.setIssueQuantiy(accessoryIssue.getIssueQuantiy());
		existingAccessoryIssue.setNonEmployee(accessoryIssue.getNonEmployee());
		existingAccessoryIssue.setRemark(accessoryIssue.getRemark());
		return accessoryissueRepository.save(existingAccessoryIssue);
		
	}

	@Override
	public void delete(long id) {
		accessoryissueRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("AccessoryIssue", "Id", id));
		accessoryissueRepository.deleteById(id);
		
	}
	

}
