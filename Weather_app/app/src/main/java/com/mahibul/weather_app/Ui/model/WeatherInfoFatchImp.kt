package com.mahibul.weather_app.Ui.model

import com.mahibul.weather_app.Network.ApiInterface
import com.mahibul.weather_app.Network.RatroficClient
import com.mahibul.weather_app.core.DataFatchCallback
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherInfoFatchImp : WeatherInfoFatch {


    override fun fetchWeatherInfo(city_name: String,call_back: DataFatchCallback<WeatherInfoData>) {
        val apiInterface = RatroficClient.clint?.create(ApiInterface::class.java)
        val call = apiInterface?.callApiWeatherInfo(city_name)

        if (call != null) {
            call.enqueue(object : Callback<WeatherInfoData>{
                override fun onResponse(
                    call: Call<WeatherInfoData>,
                    response: Response<WeatherInfoData>
                ) {
                    response.body()?.let {
                        call_back.onSuccess(it)
                    }
                }

                override fun onFailure(call: Call<WeatherInfoData>, t: Throwable) {
                    call_back.onError(t)
                }

            })
        }
    }
}