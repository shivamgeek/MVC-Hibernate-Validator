package com.shivam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	
	
	@NotNull(message="This is a required field")
	@Size(min=1, message="Enter atleast 1 character")
	String firstName;
	String lastName;
	
	@Min(value=21, message="Age should be greater than 20")
	@Max(value=50, message="Age should be less than 50")
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
