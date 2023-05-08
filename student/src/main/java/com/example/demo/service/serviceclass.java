package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.StudentModel.Loginpage;
import com.example.demo.StudentModel.Modelclass;
import com.example.demo.repository.LoginRep;
import com.example.demo.repository.carrepo;

@Service
public class serviceclass {
   @Autowired
   public carrepo cp;
   public List<Modelclass> getall()
   {
	   return cp.findAll();
   }
   public Modelclass saveinfo(Modelclass mc)
   {
	   return cp.save(mc);
   }
   public void delete(int id)
   {
	   cp.deleteById(id);
   }
   public Modelclass Update(Modelclass mc)
   {
	   return cp.saveAndFlush(mc);
   }
   public List<Modelclass> sorting(String name)
   {
	   return cp.findAll(Sort.by(name).descending()) ;
   }
   public List<Modelclass> sorting1(String name)
   {
	   return cp.findAll(Sort.by(name).ascending()) ;
   }
   public List<Modelclass> pagemodel(int num,int size)
   {
	   Page<Modelclass> mc  = cp.findAll(PageRequest.of(num , size)) ;
	   return mc.getContent();
   }
   public List<Modelclass> paginationsorting(int pnum,int psize,String name)
   {
	   Page<Modelclass> p = cp.findAll(PageRequest.of(pnum, psize,Sort.by(name).descending())) ;
	   return p.getContent();
   }
   @Autowired
   public LoginRep logrep ;
   public Loginpage saveuser(Loginpage lp)
   {
	   return logrep.save(lp) ;
   }
   public String validateUser(String username,String password)
   {
	   String result="" ;
	   Loginpage u = logrep.findByUsername(username) ;
	   if(u==null)
	   {
		   result="Invalid user" ;
	   }
	   else
	   {
		   if(u.getPassword().equals(password))
		   {
			   result="login success" ;
		   }
		   else
		   {
			   result = "Login failed" ;
		   }
			   
	   }
	   return result ;
   }
   
   
}
