package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface MyRepository extends JpaRepository<User,Long> {
	
	//@Query(value = "SELECT * from hospital_properties WHERE category =?1 ",nativeQuery = true)
	//public HospitalProperties findByCategory(String category);
	
	
}
