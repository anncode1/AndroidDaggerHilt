package com.example.hilttest.domain.catfacts.usecases

import com.example.hilttest.domain.catfacts.model.Fact
import retrofit2.Call
import retrofit2.Response

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface GetCatRandomFact {
    suspend fun invoke(): Response<Fact>
}
