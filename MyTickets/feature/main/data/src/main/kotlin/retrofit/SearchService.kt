package retrofit

import retrofit.model.search.all.TicketOfferListResponse
import retrofit.model.search.fast.FastWaysListResponse
import retrofit2.Response
import retrofit2.http.GET

interface SearchService {
    @GET(FAST_WAYS_ROUTE)
    suspend fun getFastWaysByQuery(): Response<FastWaysListResponse>

    @GET(GET_ALL_ROUTE)
    suspend fun getAllWaysByQuery(): Response<TicketOfferListResponse>

    companion object {
        private const val FAST_WAYS_ROUTE = "38b5205d-1a3d-4c2f-9d77-2f9d1ef01a4a"
        private const val GET_ALL_ROUTE = "c0464573-5a13-45c9-89f8-717436748b69"
    }
}