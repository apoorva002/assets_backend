package com.jetassets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jetassets.model.ParentType;
import com.jetassets.service.ParentTypeService;

@CrossOrigin("*")
@RestController
@RequestMapping("jet/asset/parentType")
public class ParentTypeController {
	
	
	@Autowired
	private ParentTypeService parentTypeService;
	
	       //API to create the parentType
			@PostMapping
			public ResponseEntity<ParentType> create(@RequestBody ParentType parentType){
				return new ResponseEntity<ParentType>(parentTypeService.create(parentType), HttpStatus.CREATED);
			}
			
			//API to get all parentType
			@GetMapping()
			public List<ParentType> getAll(){
				return parentTypeService.getAll();
			}
			//API to get parentType by its id
			@GetMapping("{id}")
			public ResponseEntity<Optional<ParentType>> getAccessoryById(@PathVariable("id") long id){
				return new ResponseEntity<Optional<ParentType>>(parentTypeService.getById(id), HttpStatus.OK);
			}
			//API to update a particular parentType
			@PutMapping("{id}")
			public ResponseEntity<ParentType> update(@PathVariable("id") long id ,@RequestBody ParentType assetType){
				return new ResponseEntity<ParentType>(parentTypeService.update(assetType, id), HttpStatus.OK);
			}
			
			//API to delete a particular department
			@DeleteMapping("{id}")
			public ResponseEntity<String> delete(@PathVariable("id") long id){
				// delete parentType from DB
				parentTypeService.delete(id);
				return new ResponseEntity<String>(" deleted successfully!.", HttpStatus.OK);
			}
			

}
