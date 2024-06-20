package retrofit.model.search.fast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import model.FastTicketOffer
import retrofit.model.search.PriceResponse

@Serializable
data class FastWaysResponse(
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("time_range") val timeRange: List<String>,
    @SerialName("price") val price: PriceResponse
)

fun FastWaysResponse.mapToFastTicketOffer(): FastTicketOffer =
    FastTicketOffer(
        id = id,
        title = title,
        timeRange = timeRange,
        price = price.value
    )