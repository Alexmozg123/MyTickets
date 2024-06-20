package repositoryImpl

import repository.AdRepository
import model.Offer
import retrofit.AdOfferService
import retrofit.model.ad.mapToOffer

class AdRepositoryImpl(
    private val remoteDataSource: AdOfferService
): AdRepository {

    override suspend fun getActualAdOffer(): List<Offer> {
        remoteDataSource.getActualAdOffer().also { response ->
            if (response.isSuccessful) {
                response.body()!!.offers.map { it.mapToOffer() }
            }
            return emptyList()
        }
    }
}

