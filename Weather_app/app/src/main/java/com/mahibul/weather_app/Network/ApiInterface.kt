package com.mahibul.weather_app.Network

import com.mahibul.weather_app.Ui.model.WeatherInfoData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather?APPID=0b6146f706beae9f16a063b902312f21")
    fun callApiWeatherInfo(@Query("q") name:String) : Call<WeatherInfoData>
}