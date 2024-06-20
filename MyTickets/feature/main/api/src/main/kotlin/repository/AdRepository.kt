package repository

import model.Offer

interface AdRepository {
    suspend fun getActualAdOffer(): List<Offer>
}