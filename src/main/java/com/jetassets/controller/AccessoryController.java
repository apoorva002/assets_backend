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

import com.jetassets.model.Accessory;
import com.jetassets.service.AccessoryService;
@CrossOrigin("*")
@RestController
@RequestMapping("jet/accessory")
public class AccessoryController {
	
	@Autowired
	private AccessoryService accessoryService;
	
	
	//API to create the accessory
		@PostMapping
		public ResponseEntity<Accessory> create(@RequestBody Accessory accessory){
			return new ResponseEntity<Accessory>(accessoryService.create(accessory), HttpStatus.CREATED);
		}
		
		//API to get all accessory
		@GetMapping()
		public List<Accessory> getAll(){
			return accessoryService.getAllAccessory();
		}
		//API to get accessory by its id
		@GetMapping("{id}")
		public ResponseEntity<Optional<Accessory>> getById(@PathVariable("id") long id){
			return new ResponseEntity<Optional<Accessory>>(accessoryService.getById(id), HttpStatus.OK);
		}
		//API to update a particular accessory
		@PutMapping("{id}")
		public ResponseEntity<Accessory> update(@PathVariable("id") long id ,@RequestBody Accessory accessory){
			return new ResponseEntity<Accessory>(accessoryService.update(accessory, id), HttpStatus.OK);
		}
		
		//API to delete a particular accessory
		@DeleteMapping("{id}")
		public ResponseEntity<String> delete(@PathVariable("id") long id){
			System.out.println("hellooo");
			// delete department from DB
			accessoryService.delete(id);
			return new ResponseEntity<String>("Department deleted successfully!.", HttpStatus.OK);
		}
		


}
