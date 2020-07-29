package com.example.hilttest.di

import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import com.example.hilttest.domain.catfacts.usecases.GetCatRandomFact
import com.example.hilttest.domain.catfacts.usecases.GetCatRandomFactImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by anahi.salgado on 29/07/2020
 */
@Module
@InstallIn(ApplicationComponent::class)
class UseCaseModule {

    @Provides
    fun providesGetCatRandomFact(catFactRepository: CatFactRepository): GetCatRandomFact = GetCatRandomFactImpl(catFactRepository)
}
