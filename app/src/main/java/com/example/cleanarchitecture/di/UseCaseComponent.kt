package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.data.MobilesRepoImpl
import com.example.cleanarchitecture.domain.usecases.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
    @InstallIn(ViewModelComponent::class)
    class UseCaseComponent {
        @Provides
        fun provideUseCase(repo: MobilesRepoImpl): UseCase = UseCase(repo)

    }
