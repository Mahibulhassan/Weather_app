package com.mahibul.weather_app.Ui.presenter

import com.mahibul.weather_app.Ui.model.WeatherInfoData
import com.mahibul.weather_app.Ui.model.WeatherInfoFatch
import com.mahibul.weather_app.Ui.model.WeatherInfoFatchImp
import com.mahibul.weather_app.Ui.view.ShowWeatherData
import com.mahibul.weather_app.core.DataFatchCallback

class WeatherPresenterImp(private val view : ShowWeatherData) : WeatherPresenter {

    private val mode : WeatherInfoFatch = WeatherInfoFatchImp()

    override fun getWeatherInfo(city_name : String) {
        mode.fetchWeatherInfo(city_name,object : DataFatchCallback<WeatherInfoData>{
            override fun onSuccess(data: WeatherInfoData) {
                view.showWeatherData(data)
            }

            override fun onError(throwable: Throwable) {
                view.showError(throwable)
            }

        })
    }
}