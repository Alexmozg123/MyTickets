package retrofit.model.search.all

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit.model.search.PriceResponse

@Serializable
data class LuggageResponse(
    @SerialName("has_luggage") val hasHandLuggage: Boolean,
    @SerialName("price") val price: PriceResponse
)
