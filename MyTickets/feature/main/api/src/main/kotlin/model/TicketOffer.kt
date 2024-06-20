package model

data class TicketOffer(
    val id: Int,
    val badge: String? = null,
    val providerName: String,
    val price: Int,
    val company: String,
    val departure: Info,
    val arrival: Info,
)
