package repository

import model.FastTicketOffer
import model.TicketOffer

interface SearchRepository {
    suspend fun getFastWaysByQuery(query: String): List<FastTicketOffer>
    suspend fun getAllWaysByQuery(query: String): List<TicketOffer>
}