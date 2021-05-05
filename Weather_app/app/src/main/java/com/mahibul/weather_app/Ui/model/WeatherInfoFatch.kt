package com.mahibul.weather_app.Ui.model

import com.mahibul.weather_app.core.DataFatchCallback

interface WeatherInfoFatch {
    fun fetchWeatherInfo(city_name : String ,call_back : DataFatchCallback<WeatherInfoData>)
}