package newtimes.topstories

data class TopStoriesScience(
    val copyright: String,
    val last_updated: String,
    val num_results: Int,
    val results: List<ResultXX>,
    val section: String,
    val status: String
)