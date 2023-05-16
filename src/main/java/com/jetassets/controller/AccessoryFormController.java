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
import com.jetassets.service.AccessoryFormService;


@CrossOrigin("*")
@RestController
@RequestMapping("jet/accessoryForm")
public class AccessoryFormController {
	
	
	@Autowired
	private AccessoryFormService accessoryFormService;
	
	
	        //API to create the accessoryForm
			@PostMapping
			public ResponseEntity<AccessoryForm> create(@RequestBody AccessoryForm accessoryForm){
				return new ResponseEntity<AccessoryForm>(accessoryFormService.create(accessoryForm), HttpStatus.CREATED);
			}
			
			//API to get all accessoryForm
			@GetMapping()
			public List<AccessoryForm> getAll(){
				return accessoryFormService.getAll();
			}
			//API to get accessoryForm by its id
			@GetMapping("{id}")
			public ResponseEntity<Optional<AccessoryForm>> getById(@PathVariable("id") long id){
				return new ResponseEntity<Optional<AccessoryForm>>(accessoryFormService.getById(id), HttpStatus.OK);
			}
			//API to update a particular accessoryForm
			@PutMapping("{id}")
			public ResponseEntity<AccessoryForm> update(@PathVariable("id") long id ,@RequestBody AccessoryForm accessoryForm){
				return new ResponseEntity<AccessoryForm>(accessoryFormService.update(accessoryForm, id), HttpStatus.OK);
			}
			
			//API to delete a particular accessoryForm
			@DeleteMapping("{id}")
			public ResponseEntity<String> delete(@PathVariable("id") long id){
				System.out.println("hellooo");
				// delete accessoryForm from DB
				accessoryFormService.delete(id);
				return new ResponseEntity<String>("Department deleted successfully!.", HttpStatus.OK);
			}
			


}
