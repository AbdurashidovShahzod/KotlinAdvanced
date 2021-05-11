package newtimes.communityapi

data class Community(
    val copyright: String,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)