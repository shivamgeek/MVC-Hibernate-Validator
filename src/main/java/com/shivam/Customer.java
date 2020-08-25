package com.shivam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	String firstName;
	
	@NotNull(message="This is a required field")
	@Size(min=1, message="Enter atleast 1 character")
	String lastName;

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
