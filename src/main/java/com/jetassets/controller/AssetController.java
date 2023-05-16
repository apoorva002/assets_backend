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
import com.jetassets.model.Asset;
import com.jetassets.service.AssetService;

@CrossOrigin("*")
@RestController
@RequestMapping("jet/asset")
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	
	
	//API to create the assets
	@PostMapping
	public ResponseEntity<Asset> create(@RequestBody Asset asset){
		return new ResponseEntity<Asset>(assetService.create(asset), HttpStatus.CREATED);
	}
	
	//API to get all assets
	@GetMapping()
	public List<Asset> getAll(){
		return assetService.getAll();
	}
	//API to get assets by its id
	@GetMapping("{id}")
	public ResponseEntity<Optional<Asset>> getById(@PathVariable("id") long id){
		return new ResponseEntity<Optional<Asset>>(assetService.getById(id), HttpStatus.OK);
	}
	//API to update a particular assets
	@PutMapping("{id}")
	public ResponseEntity<Asset> update(@PathVariable("id") long id ,@RequestBody Asset asset){
		return new ResponseEntity<Asset>(assetService.update(asset, id), HttpStatus.OK);
	}
	
	//API to delete a particular assets
	@DeleteMapping("{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		System.out.println("hellooo");
		// delete assets from DB
		assetService.delete(id);
		return new ResponseEntity<String>("Department deleted successfully!.", HttpStatus.OK);
	}
	


	
	
	
	
	

}
