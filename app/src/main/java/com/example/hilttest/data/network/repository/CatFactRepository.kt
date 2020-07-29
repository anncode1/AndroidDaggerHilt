package com.example.hilttest.data.network.repository

import com.example.hilttest.data.network.CatFactsService
import com.example.hilttest.domain.catfacts.model.Fact
import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import retrofit2.Call
import retrofit2.Response

/**
 * Created by anahi.salgado on 28/07/2020
 */
class CatFactRepository(
    private val catFactsService: CatFactsService
): CatFactRepository {
    override suspend fun getCatRandomFact(): Response<Fact> = catFactsService.getCatRandomFact()
}
