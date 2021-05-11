package newtimes.topstories

data class TopStoriesWorld(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<ResultXXXX>,
    val section: String,
    val status: String
)