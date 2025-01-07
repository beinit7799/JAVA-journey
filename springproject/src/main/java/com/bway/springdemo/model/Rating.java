package com.bway.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Rating {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private double rate;
	private int count;
	

}
