package com.example.hilttest.domain.catfacts.usecases

import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import com.example.hilttest.presentation.CatFactStates

/**
 * Created by anahi.salgado on 28/07/2020
 */
class GetCatRandomFactImpl(
    private val catFactRepository: CatFactRepository
): GetCatRandomFact {
    override suspend fun invoke(): CatFactStates = catFactRepository.getCatRandomFact()
}
