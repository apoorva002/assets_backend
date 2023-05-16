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
import com.jetassets.model.AccessoryIssue;
import com.jetassets.model.AssetAssignment;
import com.jetassets.service.AccessoryIssueService;



@CrossOrigin("*")
@RestController
@RequestMapping("jet/accessoryIssue")
public class AccessoryIssueController {
	
	
	@Autowired
	private AccessoryIssueService accessIssueService;
	
	//API to create the accessoryIssue
			@PostMapping
			public ResponseEntity<AccessoryIssue> create(@RequestBody AccessoryIssue accessoryIssue){
				return new ResponseEntity<AccessoryIssue>(accessIssueService.create(accessoryIssue), HttpStatus.CREATED);
			}
			
			//API to get all accessoryIssue
			@GetMapping
			public List<AccessoryIssue> getAll(){
				String name=null;
				Accessory accessory=new Accessory();
				List<AccessoryIssue> ass=accessIssueService.getAll();
				for(AccessoryIssue iss:ass) {
					long id=iss.getAccessoryId();
					if(accessory.getId()==id) {
						name=accessory.getName();
		
					}
				}
				return accessIssueService.getAll();
			}
			//API to get accessoryIssue by its id
			@GetMapping("{id}")
			public ResponseEntity<Optional<AccessoryIssue>> getById(@PathVariable("id") long id){
				return new ResponseEntity<Optional<AccessoryIssue>>(accessIssueService.getById(id), HttpStatus.OK);
			}
	
			@PutMapping("{id}")
			public ResponseEntity<AccessoryIssue> update(@PathVariable("id") long id, @RequestBody AccessoryIssue accessoryIssue) {
				return new ResponseEntity<AccessoryIssue>(accessIssueService.update(accessoryIssue, id), HttpStatus.OK);
			}



			@DeleteMapping("{id}") public ResponseEntity<String>
			  delete(@PathVariable("id") long id){ System.out.println("hellooo"); 
			  accessIssueService.delete(id); return new
			  ResponseEntity<String>("deleted successfully!.", HttpStatus.OK); }


}
