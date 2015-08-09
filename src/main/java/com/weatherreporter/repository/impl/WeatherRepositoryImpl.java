package com.weatherreporter.repository.impl;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.weatherreporter.domain.WeatherReport;
import com.weatherreporter.exception.ZipCodeNotFoundException;
import com.weatherreporter.json.JSONParser;
import com.weatherreporter.repository.WeatherRepository;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {

	/**
	 * This method returns WeatherReport object by calling another method. 
	 * @param WeatherReport
     * @return WeatherReport bean to store weather report.
	 */
	public WeatherReport getReport(WeatherReport weatherReport) {
		
		//TODO  call the web service here.
		String zipCode = weatherReport.getZipCode();
		String url = "http://api.wunderground.com/api/ed044d75b91fb500/conditions/q/"+zipCode+".json";
		JSONParser jsonParser = new JSONParser();
		JSONObject object = jsonParser.getJSONFromUrl(url);
		try {
			JSONObject js1=object.getJSONObject("current_observation");
			JSONObject js2 = js1.getJSONObject("display_location");
			String city = js2.getString("city");
			String state = js2.getString("state_name");
			double tempF = js1.getDouble("temp_f");
			// set values into bean
			weatherReport.setCityName(city);
			weatherReport.setStateName(state);
			weatherReport.setTemprature(tempF);
			return weatherReport;

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			throw new ZipCodeNotFoundException(weatherReport.getZipCode());
		}
	}

}
