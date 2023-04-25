package com.example.Laptop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LaptopModel {
	@Id
	private int id;
	private String brand;
	private String model;
	private int cost;
	LaptopModel(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
