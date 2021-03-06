package com.example.abecruz.cinepolistestia.Complejo.controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by albertocruz on 29/09/17.
 */

public class ComRetrofitClient {

    //Retrofit Instance = retrofit es una libreria de square la cual ayuda a que se puedan consumir de manera
    //mas agil los servicios web. (Similar a Volley)
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
