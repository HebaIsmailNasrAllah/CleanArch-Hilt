package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.data.MobilesRepoImpl
import com.example.cleanarchitecture.data.datasource.DataSource
import com.example.cleanarchitecture.domain.IRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepoComponent {

    @Provides
    fun provideRepo(dataSource: DataSource): IRepo = MobilesRepoImpl(dataSource)

}

