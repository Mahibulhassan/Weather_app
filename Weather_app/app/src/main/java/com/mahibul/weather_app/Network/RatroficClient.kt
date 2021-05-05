package com.mahibul.weather_app.Network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RatroficClient {

    private const val Base_Url = "https://api.openweathermap.org/data/2.5/"
    private var ratrofit : Retrofit? = null
    private val gson = GsonBuilder().setLenient().create()

    val clint: Retrofit?
        get(){
            if(ratrofit==null){
                ratrofit = Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create(gson)).build()
            }
            return ratrofit
        }
}