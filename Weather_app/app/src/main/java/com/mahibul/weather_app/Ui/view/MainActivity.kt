package com.mahibul.weather_app.Ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mahibul.weather_app.R
import com.mahibul.weather_app.Ui.model.WeatherInfoData
import com.mahibul.weather_app.Ui.presenter.WeatherPresenter
import com.mahibul.weather_app.Ui.presenter.WeatherPresenterImp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ShowWeatherData {
    private val presenter : WeatherPresenter = WeatherPresenterImp(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search.setOnClickListener {
            val city_name = seaarch_ciyName.text.toString()
            presenter.getWeatherInfo(city_name)
        }
    }

    override fun showWeatherData(weatherInfoData: WeatherInfoData) {
            val temparature = weatherInfoData.main.temp.kelvinToCelsius()
        tv_temperature.text= "Temparature is : ${temparature.toString()} Degree"
    }

    override fun showError(throwable: Throwable) {
        Toast.makeText(this,throwable.localizedMessage,Toast.LENGTH_SHORT).show()
    }


    fun Double.kelvinToCelsius() : Int {

        return  (this - 273.15).toInt()
    }
}
