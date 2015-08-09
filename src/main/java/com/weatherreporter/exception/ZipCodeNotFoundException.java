package com.weatherreporter.exception;

public class ZipCodeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -421263032533394050L;
	private String zipCode;
	
	public ZipCodeNotFoundException(String zipCode) {
		this.setZipCode(zipCode);
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
