package com.weatherreporter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.exception.ZipCodeNotFoundException;
import com.weatherreporter.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@RequestMapping(value="/")
	public String load() {
		return "redirect:/report";
	}

	@RequestMapping(value="/report", method=RequestMethod.GET)
	public String loadHomePage(Model model) {
		model.addAttribute("weatherReport", new WeatherReport());
		return "home";
	}

	@RequestMapping(value="report", method=RequestMethod.POST)
	public String loadWeatherReport(@Valid WeatherReport weatherReport, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "home";
			}
		model.addAttribute("weatherService", weatherService.getReport(weatherReport)); 
		return "weatherReport";
	}

	@ExceptionHandler(ZipCodeNotFoundException.class)
	public ModelAndView handleError(HttpServletRequest req,ZipCodeNotFoundException exception) {
	  ModelAndView mav = new ModelAndView();
	  mav.addObject("invalidZipCode", exception.getZipCode());
	  mav.setViewName("invalidZipCode");
	  return mav;
	}
}
