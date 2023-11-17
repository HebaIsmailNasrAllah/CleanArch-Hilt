package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.data.MobilesRepoImpl
import com.example.cleanarchitecture.data.datasource.DataSource
import com.example.cleanarchitecture.domain.IRepo
import com.example.cleanarchitecture.domain.usecases.UseCase
import com.example.cleanarchitecture.presentation.viewmodels.MobileVMFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppContainer {

    @Provides
    fun provideRepo(dataSource: DataSource): IRepo = MobilesRepoImpl(dataSource)

    @Provides
    fun provideUseCase(repo: MobilesRepoImpl): UseCase = UseCase(repo)
}