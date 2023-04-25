package com.example.Laptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Laptop.model.LaptopModel;

@Repository
public interface LaptopRepository extends JpaRepository <LaptopModel,Integer>{

}
