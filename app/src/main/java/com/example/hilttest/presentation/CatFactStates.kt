package com.example.hilttest.presentation

import com.example.hilttest.domain.catfacts.model.Fact

/**
 * Created by anahi.salgado on 28/07/2020
 */
sealed class CatFactStates {
    object Loading: CatFactStates()
    data class CatFactData(val fact: Fact): CatFactStates()
    data class Error(val error: Throwable): CatFactStates()
}
