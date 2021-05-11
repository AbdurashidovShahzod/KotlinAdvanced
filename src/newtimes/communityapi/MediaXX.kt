package newtimes.communityapi

data class MediaXX(
    val approved_for_syndication: Int,
    val caption: String,
    val copyright: String,
    val mediametadata: List<MediaMetadataXX>,
    val subtype: String,
    val type: String
)