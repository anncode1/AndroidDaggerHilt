package com.example.hilttest.data.network

import com.example.hilttest.domain.catfacts.model.Fact
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface CatFactsService {
    @GET("/facts/random")
    fun getCatRandomFact(): Response<Fact>
}
