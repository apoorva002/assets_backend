package com.jetassets.service;

import java.util.List;
import java.util.Optional;

import com.jetassets.model.AccessoryForm;
import com.jetassets.model.AccessoryIssue;

public interface AccessoryIssueService {
	
	public AccessoryIssue create(AccessoryIssue accessoryIssue);
	   public List<AccessoryIssue> getAll();
	   public Optional<AccessoryIssue> getById(long id);
	   public AccessoryIssue update(AccessoryIssue accessoryIssue, long id);
	   public void delete(long id);
	

}
