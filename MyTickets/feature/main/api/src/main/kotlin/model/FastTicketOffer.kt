package model

data class FastTicketOffer(
    val id: Int,
    val title: String,
    val timeRange: List<String>,
    val price: Int
)
