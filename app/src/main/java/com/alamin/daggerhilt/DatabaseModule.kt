package com.alamin.daggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
abstract class DatabaseModule {

    @Binds
    @FirebaseQualifier
    abstract fun provideFirebase(repository: FirebaseRepository): UserRepository

    @Binds
    @SQLQualifier
    abstract fun provideSQL(repository: SQLRepository): UserRepository
}