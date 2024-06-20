package retrofit.model.ad

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AdOfferListResponse(
    @SerialName("offers") val offers: List<AdOfferResponse>
)
