package com.example.demo.Service;

import com.example.demo.model.Amindi;
import com.example.demo.model.Coord;

import java.io.IOException;
import java.util.List;

public interface WeatherService {

    String GetRequest(String city) throws IOException;

    public Amindi getUrlObject(String link) throws IOException;

}
