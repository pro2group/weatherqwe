package com.example.weather.adapters

import java.util.concurrent.locks.Condition

data class WeatherModel (
    var city:String,
    var condition: String,
    var currenttemp:String,
    var maxtemp:String,
    var mintemp:String,
    var hours:String
)