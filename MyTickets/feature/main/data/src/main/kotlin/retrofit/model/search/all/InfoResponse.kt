package retrofit.model.search.all

import android.icu.text.IDNA
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import model.Info

@Serializable
data class InfoResponse(
    @SerialName("town") val town: String,
    @SerialName("date") val date: String,
    @SerialName("airport") val airport: String
)

fun InfoResponse.mapToInfo(): Info =
    Info(
        town = town,
        date = date,
        airport = airport
    )

