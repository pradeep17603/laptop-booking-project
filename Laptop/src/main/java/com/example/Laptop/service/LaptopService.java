package com.example.Laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Laptop.model.LaptopModel;
import com.example.Laptop.repository.LaptopRepository;

@Service
public class LaptopService {
	@Autowired
	LaptopRepository lr;
	public List<LaptopModel> getAllDetails()
	{
		return lr.findAll();
	}

}
