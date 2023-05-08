package com.example.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.StudentModel.Loginpage;

@Repository
public interface LoginRep extends JpaRepository<Loginpage,String> {
			Loginpage findByUsername(String username) ;
}
