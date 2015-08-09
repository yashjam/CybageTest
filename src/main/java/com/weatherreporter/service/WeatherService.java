package com.weatherreporter.service;

import com.weatherreporter.domain.WeatherReport;

public interface WeatherService {

	WeatherReport getReport(WeatherReport zipCode);
}
