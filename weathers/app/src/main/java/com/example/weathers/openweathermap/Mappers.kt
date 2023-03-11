package com.example.weathers.openweathermap

import com.example.weathers.weather.Weather

fun mapOpenWeatherDataToWeather(weatherWrapper: WeatherWrapper): Weather {
    val weatherFirst = weatherWrapper.weather.first()
    return  Weather(
        description = weatherFirst.description,
        temperature = weatherWrapper.main.temperature,
        humidity    = weatherWrapper.main.humidity,
        pressure    = weatherWrapper.main.pressure,
        iconUrl     = "http://openweathermap.org/img/wn/${weatherFirst.icon}.png"

    )
}