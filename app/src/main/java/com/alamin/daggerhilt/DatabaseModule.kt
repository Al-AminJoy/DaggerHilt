package com.alamin.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideRepository(repository: FirebaseRepository): UserRepository {
        return repository
    }
}