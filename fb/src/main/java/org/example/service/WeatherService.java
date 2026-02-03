package org.example.service;

import org.example.model.WeatherDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class WeatherService {
    public ResponseEntity<WeatherDTO> getWeather(String city) {

        //we need to get weather
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts";
       WeatherDTO[] res =  restTemplate.getForObject(url, WeatherDTO[].class);
       List<WeatherDTO> list = Arrays.asList(res);

        return  ResponseEntity.status(HttpStatus.OK).body(list.get(0));
    }

    //rest template
    //webclient
    //feign client
}
