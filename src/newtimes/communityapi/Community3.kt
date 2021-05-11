package newtimes.communityapi

data class Community3(
    val copyright: String,
    val num_results: Int,
    val results: List<ResultXX>,
    val status: String
)