package app.di

import data.remote.repository.WeatherRepositoryImpl
import data.remote.service.ApiExceptionHandler
import data.remote.service.ApiExceptionHandlerImpl
import data.remote.service.ApiService
import data.remote.service.ApiServiceImpl
import domain.repository.WeatherRepository
import domain.usecase.*
import io.ktor.client.*
import io.ktor.client.engine.java.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.gson.*
import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.dsl.module
import presentation.screen.home.HomeViewModel

val networkModule = module {
    single {
        HttpClient(Java) {
            install(ContentNegotiation) {
                gson()
            }
            defaultRequest {
                url("http://api.weatherapi.com")
            }
        }
    }
    single<ApiExceptionHandler> { ApiExceptionHandlerImpl() }

    single<ApiService> { ApiServiceImpl(get(), get()) }
}

val repositoryModule = module {
    single<WeatherRepository> { WeatherRepositoryImpl(get()) }
}

val useCaseModule = module {
    single { GetForecastByLocationUseCase(get()) }
    single { GetForecastByNameUseCase(get()) }
    single { GetWeatherByLocationUseCase(get()) }
    single { GetWeatherByNameUseCase(get()) }
    single { GetCurrentLocationUseCase(get()) }
}

val viewModelModule = module {
    single { HomeViewModel() }
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