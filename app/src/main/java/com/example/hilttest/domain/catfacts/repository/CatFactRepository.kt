package com.example.hilttest.domain.catfacts.repository

import com.example.hilttest.presentation.CatFactStates

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface CatFactRepository {
    suspend fun getCatRandomFact(): CatFactStates
}
