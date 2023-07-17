package app.di

import data.remote.repository.WeatherRepositoryImpl
import data.remote.service.ApiService
import data.remote.service.ApiServiceImpl
import domain.repository.WeatherRepository
import domain.usecase.GetForecastByLocationUseCase
import domain.usecase.GetForecastByNameUseCase
import domain.usecase.GetWeatherByLocationUseCase
import domain.usecase.GetWeatherByNameUseCase
import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.gson.*
import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.dsl.module

val networkModule = module {
    single {
        HttpClient(Java) {
            install(ContentNegotiation) {
                gson()
            }
            defaultRequest {
                url("http://api.weatherapi.com/v1")
                url.parameters.append("key", "e803fb0588cf45e1a78121355231107")
            }
        }
    }

    single<ApiService> { ApiServiceImpl(get()) }
}

val repositoryModule = module {
    single<WeatherRepository> { WeatherRepositoryImpl(get()) }
}

val useCaseModule = module {
    single { GetForecastByLocationUseCase(get()) }
    single { GetForecastByNameUseCase(get()) }
    single { GetWeatherByLocationUseCase(get()) }
    single { GetWeatherByNameUseCase(get()) }
}

val viewModelModule = module {

}
lateinit var koin: Koin
fun initKoin() = startKoin {
    modules(
        networkModule,
        repositoryModule,
        useCaseModule,
        viewModelModule,
    )
}.koin

inline fun <reified T : Any> koinViewModel() = koin.get<T>()