package com.weatherreporter.domain;

import com.weatherreporter.validator.ZipCode;

public class WeatherReport {

	@ZipCode
	private String zipCode;
	private String cityName;
	private String stateName;
	private double temprature;
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public double getTemprature() {
		return temprature;
	}
	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}
	
	
}
