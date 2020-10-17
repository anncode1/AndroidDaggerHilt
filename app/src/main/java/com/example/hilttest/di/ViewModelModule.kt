package com.example.hilttest.di

import com.example.hilttest.domain.catfacts.usecases.GetCatRandomFact
import com.example.hilttest.presentation.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by anahi.salgado on 29/07/2020
 */
@Module
@InstallIn(ActivityRetainedComponent::class)
class ViewModelModule {

    @Provides
    fun providesMainViewModel(
        getCatRandomFact: GetCatRandomFact
    ): MainViewModel = MainViewModel(getCatRandomFact)
}

