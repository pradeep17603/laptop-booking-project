package com.example.demo.StudentModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Modelclass {
   @Id
   private int id;
   private String carname;
   private String brand;
   private String variant;
   private String seatercapacity;
   private String onroadprice;
   private String color;
   private String manufactureyear;
   public Modelclass()
 {
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getVariant() {
	return variant;
}
public void setVariant(String variant) {
	this.variant = variant;
}
public String getSeatercapacity() {
	return seatercapacity;
}
public void setSeatercapacity(String seatercapacity) {
	this.seatercapacity = seatercapacity;
}
public String getOnroadprice() {
	return onroadprice;
}
public void setOnroadprice(String onroadprice) {
	this.onroadprice = onroadprice;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getManufactureyear() {
	return manufactureyear;
}
public void setManufactureyear(String manufactureyear) {
	this.manufactureyear = manufactureyear;
}
   
}
