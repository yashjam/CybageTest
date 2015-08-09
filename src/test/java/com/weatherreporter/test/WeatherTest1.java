package com.weatherreporter.test;

import org.junit.Before;
import org.junit.Test;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.exception.ZipCodeNotFoundException;
import com.weatherreporter.repository.impl.WeatherRepositoryImpl;

/**
 * Expected: This test case should pass. 
 * Because zipCode 11111 does not exist. method should throw exception.
 */
public class WeatherTest1 {

     private WeatherRepositoryImpl wrimpl;
     private WeatherReport wr;
     @Before
     public void setup() {
     wr = new  WeatherReport();	
     wr.setZipCode("11111");
    }

    @Test(expected = ZipCodeNotFoundException.class)
    public void testGetReport(){
    	  wrimpl = new  WeatherRepositoryImpl();	
          wrimpl.getReport(wr);
    }

}