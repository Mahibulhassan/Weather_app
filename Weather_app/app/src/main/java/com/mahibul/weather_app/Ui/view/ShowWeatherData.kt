package com.mahibul.weather_app.Ui.view

import com.mahibul.weather_app.Ui.model.WeatherInfoData

interface ShowWeatherData {
    fun showWeatherData(weatherInfoData: WeatherInfoData)
    fun showError (throwable: Throwable)
}