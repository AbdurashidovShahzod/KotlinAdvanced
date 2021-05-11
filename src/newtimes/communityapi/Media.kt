package newtimes.communityapi

data class Media(
    val approved_for_syndication: Int,
    val caption: String,
    val copyright: String,
    val mediametadata: List<MediaMetadata>,
    val subtype: String,
    val type: String
)