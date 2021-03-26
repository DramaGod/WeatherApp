package com.example.demo.Service;

import com.example.demo.model.Amindi;
import com.example.demo.model.Coord;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService{


    private OkHttpClient client;
    private Response response;
    private String CityName;
    private Call call;

    public WeatherServiceImpl() {
        this.client = new OkHttpClient();
    }

    @Override
    public String GetRequest(String city ) throws IOException {
        client = new OkHttpClient();

        Request request=new Request.Builder()
                .url("http://api.openweathermap.org/data/2.5/weather?q=" +city+"&appid=b8274075efc6d2a7f23abb3a9adf10ca")
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();

    }

    @Override
    public Amindi getUrlObject(String link) throws IOException {

        
        String jsonString = link;

        Gson gson=new Gson();

        return gson.fromJson(jsonString, Amindi.class);

    }

 //   @Override
    //public List<Coord>  fetch () throws Exception{

//
//        List<Coord> AllCoords = new ArrayList<Coord>();
//        Request rawJson = call.request();
//        JSONObject root= new JSONObject(rawJson);
//        JSONArray coords = root.getJSONArray("coord");
//        for (int i=0; i<coords.length(); i++){
//            JSONObject JsonCoord = coords.getJSONObject(i);
//            Coord coord= new Coord();
//            String lon=JsonCoord.getString("lon");
//            String lat=JsonCoord.getString("lat");
//
//            coord.setLat(lat);
//            coord.setLat(lon);
//            AllCoords.add(coord);
//
//        }
//        GsonBuilder builder= new GsonBuilder();
//        Gson gson= builder.create();
//        BufferedReader bufferedReader=new BufferedReader();
//        return AllCoords;
       // return null;
   // }




    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }
}
