package com.example.hilttest.domain.catfacts.repository

import com.example.hilttest.domain.catfacts.model.Fact
import retrofit2.Call
import retrofit2.Response

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface CatFactRepository {
    fun getCatRandomFact(): Response<Fact>
}
