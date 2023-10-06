package com.jsp.springboot_hospitalmanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot_hospitalmanagementsystem.dto.Hospital;

public interface Hospitalrepo extends JpaRepository<Hospital, Integer>{

	public Hospital findbyemail(String email) ;
		
	}
