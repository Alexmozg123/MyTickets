import org.koin.dsl.module
import repository.AdRepository
import repository.SearchRepository
import repositoryImpl.AdRepositoryImpl
import repositoryImpl.SearchRepositoryImpl
import retrofit.AdOfferService
import retrofit.SearchService
import retrofit2.Retrofit

private val airTicketsModule = module {
    single<AdOfferService> { get<Retrofit>().create(AdOfferService::class.java) }
    single<SearchService> { get<Retrofit>().create(SearchService::class.java) }
    single<AdRepository> { AdRepositoryImpl(get()) }
    single<SearchRepository> { SearchRepositoryImpl(get()) }
}

val mainModule = module {
    includes(
        airTicketsModule
    )
}