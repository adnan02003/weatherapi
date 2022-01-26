package com.adnan.weather.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adnan.weather.component.WeatherComponent;
import com.adnan.weather.payload.ApiResponse;


@RestController
@RequestMapping("/api/adnan")
public class WeatherController {

    private static final Logger logger = LogManager.getLogger(WeatherController.class);
    
    @Autowired
    private WeatherComponent weatherComponent;
    

    @GetMapping("/weather_by_city_country")
    public ResponseEntity getWeatherByCityAndCountry(@RequestParam(
            "q") String q) {
    	logger.info("testing");
    	return ResponseEntity.ok(new ApiResponse(true,weatherComponent.getWeatherByCityAndCountry(q)));
    }
    
    @GetMapping("/weather_by_lat_lon")
    public ResponseEntity getWeatherByLatAndLon(@RequestParam(
            "lat") String lat,@RequestParam("lon") String lon) {
    	logger.info("testing");
    	return ResponseEntity.ok(new ApiResponse(true,weatherComponent.getWeatherByLatAndLon(lat,lon)));
    }
    
    
   
}
