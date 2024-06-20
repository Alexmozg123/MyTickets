package repositoryImpl

import model.FastTicketOffer
import model.TicketOffer
import repository.SearchRepository
import retrofit.SearchService
import retrofit.model.search.all.mapToTicketOffer
import retrofit.model.search.fast.mapToFastTicketOffer

class SearchRepositoryImpl(
    private val remoteDataSource: SearchService
): SearchRepository {

    override suspend fun getFastWaysByQuery(query: String): List<FastTicketOffer> {
        remoteDataSource.getFastWaysByQuery().also { response ->
            if (response.isSuccessful) {
                response.body()!!.tickets.map { it.mapToFastTicketOffer() }
            }
            return emptyList()
        }
    }

    override suspend fun getAllWaysByQuery(query: String): List<TicketOffer> {
        remoteDataSource.getAllWaysByQuery().also { response ->
            if (response.isSuccessful) {
                response.body()!!.tickets.map { it.mapToTicketOffer() }
            }
            return emptyList()
        }
    }
}