package com.weatherreporter.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.repository.impl.WeatherRepositoryImpl;

/**
 * Expected: This test case should pass. 
 * Because zipCode 22222 exists. 
 */
public class WeatherTest3 {

     private WeatherRepositoryImpl wrimpl;
     private WeatherReport wr;
     @Before
     public void setup() {
     wr = new  WeatherReport();	
     wr.setZipCode("22222");
    }

    @Test
    public void testGetReport(){
    	  wrimpl = new  WeatherRepositoryImpl();	
          assertNotNull(wrimpl.getReport(wr));
    }

}