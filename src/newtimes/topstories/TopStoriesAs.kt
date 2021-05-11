package newtimes.topstories

data class TopStoriesAs(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<ResultXXX>,
    val section: String,
    val status: String
)