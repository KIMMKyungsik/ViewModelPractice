package com.application.viewmodelpractice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.application.viewmodelpractice.api.MyApi
import com.application.viewmodelpractice.api.RetrofitInstance
import com.application.viewmodelpractice.model.Plant
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.create

class MainViewModel : ViewModel() {


    val retrofitInstance: MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
            get() = _result


    fun getAllData() = viewModelScope.launch {
        _result.value = retrofitInstance.getAllPlant()



    }


}