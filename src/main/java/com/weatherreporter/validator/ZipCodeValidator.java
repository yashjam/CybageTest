package com.weatherreporter.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipCodeValidator implements ConstraintValidator<ZipCode, String>{

  public void initialize(ZipCode constraintAnnotation) {
    //  intentionally left blank; this is the place to initialize the constraint annotation for any sensible default values.
  }

  public boolean isValid(String value,ConstraintValidatorContext context) {
	  if (value==null || value.equals("")) {
		  return false;
	  }
	  else {
		  try {
		  int i = new Integer(value);
		  if (i<11111 || i>99999) {
			  throw new Exception();
		  }
		  return true;
		  }
		  catch (Exception e) {
			  return false;
		  }
	  }
  }
}