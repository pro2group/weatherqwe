package com.example.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.adapters.WeatherModel

class mainViewModel : ViewModel() {
    val LDataC = MutableLiveData<WeatherModel>()
    val LLDataC =MutableLiveData<WeatherModel>()

}