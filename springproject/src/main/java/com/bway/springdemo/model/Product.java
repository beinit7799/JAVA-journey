package com.bway.springdemo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private double price;
	@Column(columnDefinition = "longtext")
	private String description;
	private String category;
	private String image;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rating")
	private Rating rating;

}
