package com.weatherreporter.test;

import org.junit.Before;
import org.junit.Test;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.exception.ZipCodeNotFoundException;
import com.weatherreporter.repository.impl.WeatherRepositoryImpl;

/**
 * Expected: This test case should fail. 
 * Because zipCode 22222 does exist. And method should not throw exception.
 */
public class WeatherTest2 {

     private WeatherRepositoryImpl wrimpl;
     private WeatherReport wr;
     @Before
     public void setup() {
     wrimpl = new  WeatherRepositoryImpl();
     wr = new  WeatherReport();	
     wr.setZipCode("22222");
    }

    @Test(expected = ZipCodeNotFoundException.class)
    public void testGetReport(){
          wrimpl.getReport(wr);
    }

}