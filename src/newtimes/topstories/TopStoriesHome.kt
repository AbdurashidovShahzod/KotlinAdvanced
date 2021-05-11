package newtimes.topstories

data class TopStoriesHome(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<ResultX>,
    val section: String,
    val status: String
)