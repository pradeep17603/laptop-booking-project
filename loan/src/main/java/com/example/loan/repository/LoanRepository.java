package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.model.LoanModel;



@Repository
public interface LoanRepository extends JpaRepository<LoanModel,Integer> {

}
