package com.example.hilttest.di

import com.example.hilttest.domain.model.Contact
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 * Created by anahi.salgado on 27/07/2020
 */
@Module
@InstallIn(ApplicationComponent::class)
class AgendaModule {

    @Provides
    fun provideListContacts(): List<Contact> {
        return listOf(
            Contact("Ann", "555-5555"),
            Contact("Leo", "444-4444"),
            Contact("Abril", "333-3333"),
            Contact("Moy", "222-2222")
        )
    }

}
