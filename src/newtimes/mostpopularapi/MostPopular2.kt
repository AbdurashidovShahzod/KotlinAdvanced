package newtimes.mostpopularapi

data class MostPopular2(
    val copyright: String,
    val num_results: Int,
    val results: List<ResultX>,
    val status: String
)