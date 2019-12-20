package com.jt.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placement")
public class PlacementPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	
	@Column
	private int year_of_passing;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getYear_of_passing() {
		return year_of_passing;
	}

	public void setYear_of_passing(int year_of_passing) {
		this.year_of_passing = year_of_passing;
	} 
	
	
}
