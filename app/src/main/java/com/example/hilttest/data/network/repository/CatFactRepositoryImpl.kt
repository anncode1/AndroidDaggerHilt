package com.example.hilttest.data.network.repository

import com.example.hilttest.data.network.CatFactsService
import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import com.example.hilttest.presentation.CatFactStates
import java.io.IOException

/**
 * Created by anahi.salgado on 28/07/2020
 */
class CatFactRepositoryImpl(
    private val catFactsService: CatFactsService
): CatFactRepository {
    override suspend fun getCatRandomFact(): CatFactStates {
        return try {
            val response = catFactsService.getCatRandomFact()
            val fact = response.body()
            return if (fact != null) CatFactStates.CatFactData(fact) else CatFactStates.Error(IOException("Data is null"))
        } catch (exception: Exception) {
            CatFactStates.Error(exception)
        }
    }
}
