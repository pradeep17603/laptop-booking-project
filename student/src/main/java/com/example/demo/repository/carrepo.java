package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.StudentModel.Modelclass;

public interface carrepo extends JpaRepository<Modelclass, Integer> {

}
