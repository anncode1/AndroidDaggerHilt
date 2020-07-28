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
            Contact("Anahi", "555-5555"),
            Contact("Mauricio", "444-4444"),
            Contact("Rodrigo", "333-3333"),
            Contact("Mirella", "222-2222")
        )
    }

}
