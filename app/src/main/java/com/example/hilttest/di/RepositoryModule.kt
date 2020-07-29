package com.example.hilttest.di

import com.example.hilttest.data.network.CatFactsService
import com.example.hilttest.data.network.repository.CatFactRepositoryImpl
import com.example.hilttest.domain.catfacts.repository.CatFactRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by anahi.salgado on 29/07/2020
 */
@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    fun providesCatFactRepository(
        catFactsService: CatFactsService
    ): CatFactRepository = CatFactRepositoryImpl(catFactsService)
}


