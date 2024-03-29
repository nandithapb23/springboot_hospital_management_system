package com.jsp.springboot_hospitalmanagementsystem.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Medorder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private Date date;
	private String doctor;
	
	@ManyToOne
	private Encounter encounter;
}
