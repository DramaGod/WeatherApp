package com.example.demo.Controller;

import com.example.demo.Service.WeatherService;
import com.example.demo.model.Amindi;
import com.example.demo.model.Sys;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController extends OpenController {


    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(value="/coords", method = RequestMethod.POST)
    public Amindi searchCoords() throws Exception {


        Amindi amindi=weatherService.getUrlObject(weatherService.GetRequest("tbilisi"));

        return weatherService.getUrlObject(weatherService.GetRequest("tbilisi"));
    }

}
