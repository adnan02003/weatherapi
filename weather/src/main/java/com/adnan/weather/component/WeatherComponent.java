package com.adnan.weather.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.adnan.weather.payload.Root;

@Component
public class WeatherComponent {
	
	@Value("${weather.api.key}")
	private String weatherApiKey;
	
	@Value("${weather.api.endpoint.url}")
	private String uri;
	
	//http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=1568e8cfd9ecd28b5395c8f7b5e85158
	public Root getWeatherByCityAndCountry(String q) {
		
		RestTemplate restTemplate = new RestTemplate();
		Root response
		  = restTemplate.getForEntity(uri + "?q="+q+"&APPID="+weatherApiKey, Root.class).getBody();
		return response;
		
	}
	
	//api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
	public Root getWeatherByLatAndLon(String lat,String lon) {
		
		RestTemplate restTemplate = new RestTemplate();
		Root response
		  = restTemplate.getForEntity(uri + "?lat="+lat+"&lon="+lon+"&APPID="+weatherApiKey, Root.class).getBody();
		return response;
		
	}

}
