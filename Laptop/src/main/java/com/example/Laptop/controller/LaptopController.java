package com.example.Laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Laptop.model.LaptopModel;
import com.example.Laptop.repository.LaptopRepository;

@RestController
public class LaptopController {
	@Autowired
	LaptopRepository lr;
	@GetMapping("/lap")
	public List<LaptopModel> getAllDetails(){
		 return lr.findAll();
	}
	@GetMapping("/lap/{id}")
	public LaptopModel getDetailsById(@PathVariable int id)
	{
		return lr.findById(id).orElse(null);
	}
	@DeleteMapping("/lap/{id}")
	public String detailsById(@PathVariable int id)
	{
		lr.deleteById(id);
		return "deleted";
	}
	@PostMapping("/save")
	public String saveDetails(@RequestBody LaptopModel id)
	{
		lr.save(id);
		return "Id Details Saved";
	}
	@PutMapping("/put")
	public LaptopModel updateId(@RequestBody LaptopModel id)
	{
		return lr.save(id);
	}
	
	

}
