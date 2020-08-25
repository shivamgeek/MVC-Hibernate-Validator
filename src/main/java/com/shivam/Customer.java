package com.shivam;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	
	String firstName;
	
	@NotNull(message="Last name is a field")
	@Size(min=1, message="Enter atleast 1 character")
	String lastName;
	
	@NotNull(message="Age is a mandatory field")
	@Min(value=21, message="Age should be greater than 20")
	@Max(value=50, message="Age should be less than 50")
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
