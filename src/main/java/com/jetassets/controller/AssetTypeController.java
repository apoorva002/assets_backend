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
import com.jetassets.model.AssetType;
import com.jetassets.service.AssetTypeService;

@CrossOrigin("*")
@RestController
@RequestMapping("jet/assetType")
public class AssetTypeController {
	
	
	@Autowired
	private AssetTypeService assetTypeService;
	
	
	//API to create the assetType
		@PostMapping
		public ResponseEntity<AssetType> create(@RequestBody AssetType assetType){
			return new ResponseEntity<AssetType>(assetTypeService.create(assetType), HttpStatus.CREATED);
		}
		
		//API to get all assetType
		@GetMapping()
		public List<AssetType> getAll(){
			return assetTypeService.getAllAssetType();
		}
		//API to get assetType by its id
		@GetMapping("{id}")
		public ResponseEntity<Optional<AssetType>> getAccessoryById(@PathVariable("id") long id){
			return new ResponseEntity<Optional<AssetType>>(assetTypeService.getById(id), HttpStatus.OK);
		}
		//API to update a particular assetType
		@PutMapping("{id}")
		public ResponseEntity<AssetType> update(@PathVariable("id") long id ,@RequestBody AssetType assetType){
			return new ResponseEntity<AssetType>(assetTypeService.update(assetType, id), HttpStatus.OK);
		}
		
		//API to delete a particular department
		@DeleteMapping("{id}")
		public ResponseEntity<String> delete(@PathVariable("id") long id){
			// delete department from DB
			assetTypeService.delete(id);
			return new ResponseEntity<String>(" deleted successfully!.", HttpStatus.OK);
		}
		



}
