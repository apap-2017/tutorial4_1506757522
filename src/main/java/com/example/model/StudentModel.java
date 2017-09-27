package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
    private String npm;
    private String name;
    private double gpa;

    public StudentModel(String npm, String name, double gpa) {
		this.npm = npm;
		this.name = name;
		this.gpa = gpa;
	}
    
    public StudentModel() {
    	
    }
	
	public void setNpm(String npm) {
		this.npm = npm;
	}
	
	public String getNpm() {
		return this.npm;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return this.gpa;
	}
}
