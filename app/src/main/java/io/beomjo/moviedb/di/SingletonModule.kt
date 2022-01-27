package io.beomjo.moviedb.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.beomjo.moviedb.BuildConfig
import io.beomjo.moviedb.domain.ApiKey

@Module
@InstallIn(SingletonComponent::class)
internal object SingletonModule {

    @Provides
    @ApiKey
    fun provideApiKey(): String {
        return BuildConfig.REST_KEY
    }
}
