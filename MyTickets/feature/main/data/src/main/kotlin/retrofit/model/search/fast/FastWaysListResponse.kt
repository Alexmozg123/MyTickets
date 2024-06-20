package retrofit.model.search.fast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FastWaysListResponse(
    @SerialName("tickets") val tickets: List<FastWaysResponse>
)
