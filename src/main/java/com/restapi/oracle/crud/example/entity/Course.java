package com.restapi.oracle.crud.example.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "COURSES")
public class Course {
	
	@Id
    private String id;
	
    @Column(name="course_name")
    private String courseName;
    
    private String rating;
    
    private String price;
    
    @Column(name="trainer_name")
    private String trainerName;
    
    @Column(name="number_of_days")
    private String numberOfDays;
    
    
       
	public Course() {
		super();		
	}


	public Course(String id, String courseName, String rating, String price, String trainerName, String numberOfDays) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.rating = rating;
		this.price = price;
		this.trainerName = trainerName;
		this.numberOfDays = numberOfDays;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}


	public String getNumberOfDays() {
		return numberOfDays;
	}


	public void setNumberOfDays(String numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
    
    
	
	
    
    
	
}
