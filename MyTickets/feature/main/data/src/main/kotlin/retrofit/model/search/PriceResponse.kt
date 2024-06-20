package retrofit.model.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PriceResponse(
    @SerialName("value") val value: Int
)
