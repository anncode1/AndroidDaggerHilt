package com.example.hilttest.domain.catfacts.usecases

import com.example.hilttest.presentation.CatFactStates

/**
 * Created by anahi.salgado on 28/07/2020
 */
interface GetCatRandomFact {
    suspend operator fun invoke(): CatFactStates
}
