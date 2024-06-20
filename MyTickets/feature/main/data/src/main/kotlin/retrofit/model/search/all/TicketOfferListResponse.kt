package retrofit.model.search.all

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit.model.search.PriceResponse

@Serializable
data class TicketOfferListResponse(
    @SerialName("tickets") val tickets: List<TicketOfferResponse>
)


