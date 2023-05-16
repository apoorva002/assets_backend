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

import com.jetassets.model.AccessoryForm;
import com.jetassets.model.AssetAssignment;
import com.jetassets.service.AssetAssignmentService;

@CrossOrigin("*")
@RestController
@RequestMapping("jet/assetAssignment")
public class AssetAssignmentController {

	@Autowired
	private AssetAssignmentService assetAssignmetService;

	
	@PostMapping
	public ResponseEntity<AssetAssignment> create(@RequestBody AssetAssignment assetAssignment) {
		return new ResponseEntity<AssetAssignment>(assetAssignmetService.create(assetAssignment), HttpStatus.CREATED);
	}

	
	@GetMapping()
	public List<AssetAssignment> getAll() {
		return assetAssignmetService.getAll();
	} 

	@GetMapping("{id}")
	public ResponseEntity<Optional<AssetAssignment>> getById(@PathVariable("id") long id) {
		return new ResponseEntity<Optional<AssetAssignment>>(assetAssignmetService.getById(id), HttpStatus.OK);
	} 

	@PutMapping("{id}")
	public ResponseEntity<AssetAssignment> update(@PathVariable("id") long id, @RequestBody AssetAssignment assetAssignment) {
		return new ResponseEntity<AssetAssignment>(assetAssignmetService.update(assetAssignment, id), HttpStatus.OK);
	}



	@DeleteMapping("{id}") public ResponseEntity<String>
	  delete(@PathVariable("id") long id){ System.out.println("hellooo"); 
	  assetAssignmetService.delete(id); return new
	  ResponseEntity<String>("Department deleted successfully!.", HttpStatus.OK); }

}
