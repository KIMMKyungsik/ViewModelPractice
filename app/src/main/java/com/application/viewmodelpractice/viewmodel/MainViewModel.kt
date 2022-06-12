package com.application.viewmodelpractice.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.application.viewmodelpractice.api.MyApi
import com.application.viewmodelpractice.api.RetrofitInstance
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.create

class MainViewModel : ViewModel() {


    val retrofitInstance: MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)


    fun getAllData() = viewModelScope.launch {
        retrofitInstance.getAllPlant().toString()

    }


}