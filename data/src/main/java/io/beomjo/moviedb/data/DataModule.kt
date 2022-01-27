package io.beomjo.moviedb.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.beomjo.moviedb.data.datasource.remote.RetrofitAdapter
import io.beomjo.moviedb.domain.ApiKey
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [DataModule.DataBindModule::class])
@InstallIn(SingletonComponent::class)
internal object DataModule {

    @Singleton
    @Provides
    fun provideRetrofitInstance(
        @ApiKey apiKey: String
    ): Retrofit {
        return RetrofitAdapter.getInstance(Urls.BASE_URL, apiKey)
    }

    @Module
    @InstallIn(SingletonComponent::class)
    abstract class DataBindModule
}
