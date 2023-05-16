package com.jetassets.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetassets.exception.ResourceNotFoundException;
import com.jetassets.model.AccessoryForm;
import com.jetassets.model.AssetAssignment;
import com.jetassets.repository.AssetAsignmentRepository;
import com.jetassets.service.AssetAssignmentService;



@Service
public class AssetAssignmentServiceImpl implements AssetAssignmentService {
	
	@Autowired
	private AssetAsignmentRepository assetAssignmentRepository;

	@Override
	public AssetAssignment create(AssetAssignment assetAssignment) {
		// TODO Auto-generated method stub
		return assetAssignmentRepository.save(assetAssignment);
	}

	@Override
	public List<AssetAssignment> getAll() {
		// TODO Auto-generated method stub
		return assetAssignmentRepository.findAll();
	}

	@Override
	public Optional<AssetAssignment> getById(long id) {
		// TODO Auto-generated method stub
		return assetAssignmentRepository.findById(id);
	}

	@Override
	public AssetAssignment update(AssetAssignment assetAssignment, long id) {
		AssetAssignment exitingAssetAssignmentRepository=assetAssignmentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("assetAssignment","Id",id));
		exitingAssetAssignmentRepository.setAsset(assetAssignment.getAsset());
		exitingAssetAssignmentRepository.setEmployee(assetAssignment.getEmployee());
		exitingAssetAssignmentRepository.setIssueCondition(assetAssignment.getIssueCondition());
		exitingAssetAssignmentRepository.setIssueDate(assetAssignment.getIssueDate());
		exitingAssetAssignmentRepository.setIssueRemark(assetAssignment.getIssueRemark());
		exitingAssetAssignmentRepository.setReturnCondition(assetAssignment.getReturnCondition());
		exitingAssetAssignmentRepository.setReturnDate(assetAssignment.getReturnDate());
		exitingAssetAssignmentRepository.setReturnRemark(assetAssignment.getReturnRemark());
		return assetAssignmentRepository.save(exitingAssetAssignmentRepository);

		
	}

	@Override
	public void delete(long id) {
		assetAssignmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("assetAssignment", "Id", id));
		assetAssignmentRepository.deleteById(id);
		
	}

}
