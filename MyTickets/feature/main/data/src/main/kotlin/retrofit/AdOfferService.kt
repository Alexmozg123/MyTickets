package retrofit

import retrofit.model.ad.AdOfferListResponse
import retrofit2.Response
import retrofit2.http.GET

interface AdOfferService {
    @GET(ACTUAL_AD_ROUTE)
    suspend fun getActualAdOffer(): Response<AdOfferListResponse>

    companion object {
        private const val ACTUAL_AD_ROUTE = "ad9a46ba-276c-4a81-88a6-c068e51cce3a"
    }
}