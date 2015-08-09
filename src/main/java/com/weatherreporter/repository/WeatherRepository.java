package com.weatherreporter.repository;

import com.weatherreporter.domain.WeatherReport;

public interface WeatherRepository {

	WeatherReport getReport(WeatherReport zipCode) ;

}
