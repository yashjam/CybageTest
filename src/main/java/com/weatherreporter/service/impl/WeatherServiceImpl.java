package com.weatherreporter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.repository.WeatherRepository;
import com.weatherreporter.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;

	public WeatherReport getReport(WeatherReport report) {
		return weatherRepository.getReport(report);
	}

}
