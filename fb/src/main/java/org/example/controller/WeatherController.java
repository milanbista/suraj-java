package org.example.controller;

import org.example.model.WeatherDTO;
import org.example.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/getweather/{city}")
    public ResponseEntity<WeatherDTO> getWeather(@PathVariable("city") String city){

        return weatherService.getWeather(city);

    }
}
