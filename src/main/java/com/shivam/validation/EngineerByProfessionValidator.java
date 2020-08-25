package com.shivam.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EngineerByProfessionValidator implements ConstraintValidator<Profession, String> {

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.toLowerCase().contains("engineer")) {
			return true;
		}
		return false;
	}

}
