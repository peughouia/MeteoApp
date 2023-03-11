package com.example.weathers.city

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weathers.R
import com.example.weathers.weather.WeatherActivity
import com.example.weathers.weather.WeatherFragment

class CityActivity : AppCompatActivity(), CityFragment.CityFragmentListener {

    private  lateinit var  cityFragment: CityFragment
    private  var currentCity:City?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        cityFragment = supportFragmentManager.findFragmentById(R.id.city_fragment)as CityFragment
        cityFragment.listener = this
    }

    override fun onCitySelected(city: City) {
        startWeatherActivity(city)
    }

    private fun startWeatherActivity(city: City) {
        val intent = Intent(this,WeatherActivity::class.java)
        intent.putExtra(WeatherFragment.EXTRA_CITY_NAME,city.name)
        startActivity(intent)
    }
}