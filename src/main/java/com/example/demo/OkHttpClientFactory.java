package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import okhttp3.OkHttpClient;

@Configuration

public class OkHttpClientFactory {
    @Bean
    public OkHttpClient OkHttpClientFactory() {
        return new OkHttpClient();
    }




}