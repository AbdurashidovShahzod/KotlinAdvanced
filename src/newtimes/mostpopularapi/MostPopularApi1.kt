package newtimes.mostpopularapi

data class MostPopularApi1(
    val copyright: String,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)