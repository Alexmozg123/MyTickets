package retrofit.model.search.all

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import model.TicketOffer
import retrofit.model.search.PriceResponse

@Serializable
data class TicketOfferResponse(
    @SerialName("id") val id: Int,
    @SerialName("badge") val badge: String,
    @SerialName("price") val price: PriceResponse,
    @SerialName("provider_name") val providerName: String,
    @SerialName("company") val company: String,
    @SerialName("departure") val departure: InfoResponse,
    @SerialName("arrival") val arrival: InfoResponse,
    @SerialName("has_transfer") val hasTransfer: Boolean,
    @SerialName("has_visa_transfer") val hasVisaTransfer: Boolean,
    @SerialName("luggage") val luggage: LuggageResponse,
    @SerialName("hand_luggage") val handLuggage: HandLuggageResponse,
    @SerialName("is_returnable") val isReturnable: Boolean,
    @SerialName("is_exchangable") val isExchangable: Boolean,
)

fun TicketOfferResponse.mapToTicketOffer(): TicketOffer =
    TicketOffer(
        id = id,
        badge = badge,
        providerName = providerName,
        price = price.value,
        company = company,
        departure = departure.mapToInfo(),
        arrival = arrival.mapToInfo()
    )
