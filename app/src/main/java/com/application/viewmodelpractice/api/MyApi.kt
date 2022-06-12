package com.application.viewmodelpractice.api

import com.application.viewmodelpractice.model.Plant
import retrofit2.http.GET

interface MyApi {

    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlant() : List<Plant>

}