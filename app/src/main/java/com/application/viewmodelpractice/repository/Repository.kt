package com.application.viewmodelpractice.repository

import com.application.viewmodelpractice.api.MyApi
import com.application.viewmodelpractice.api.RetrofitInstance

class Repository {



    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllData() = client.getAllPlant()
}