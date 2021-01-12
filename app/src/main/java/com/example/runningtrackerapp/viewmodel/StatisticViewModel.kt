package com.example.runningtrackerapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningtrackerapp.repository.MainRepository

class StatisticViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}