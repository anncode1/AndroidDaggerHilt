package com.example.hilttest.domain.catfacts.usecases

import com.example.hilttest.domain.catfacts.model.Fact
import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import retrofit2.Response

/**
 * Created by anahi.salgado on 28/07/2020
 */
class GetCatRandomFactImpl(private val catFactRepository: CatFactRepository): GetCatRandomFact {
    override suspend fun invoke(): Response<Fact> = catFactRepository.getCatRandomFact()
}
