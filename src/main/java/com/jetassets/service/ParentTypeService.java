package com.jetassets.service;

import java.util.List;
import java.util.Optional;
import com.jetassets.model.ParentType;

public interface ParentTypeService {
	public ParentType create(ParentType parentType);
	   public List<ParentType> getAll();
	   public Optional<ParentType> getById(long id);
	   public ParentType update(ParentType parentType, long id);
	   public void delete(long id);
	
	

}
