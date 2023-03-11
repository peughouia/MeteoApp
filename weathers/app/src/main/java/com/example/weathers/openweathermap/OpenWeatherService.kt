package com.example.weathers.openweathermap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY="00ad40a47f5e7c9d6603fa49b5e4b35d"

interface OpenWeatherService {

    @GET("data/2.5/weather?units=metric&lang=fr")
    fun getWeather(@Query("q") cityName:String,
                    @Query("appid") apiKey:String = API_KEY):Call<WeatherWrapper>

}