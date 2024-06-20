package retrofit.model.ad

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import model.Offer

@Serializable
data class AdOfferResponse(
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("town") val town: String,
    @SerialName("price") val price: Int
)

fun AdOfferResponse.mapToOffer(): Offer =
    Offer(
        id = id,
        title = title,
        town = town,
        price = price
    )