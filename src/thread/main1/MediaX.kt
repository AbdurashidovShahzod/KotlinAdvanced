package thread.main1

import thread.main1.MediaMetadataX

data class MediaX(
    val approved_for_syndication: Int,
    val caption: String,
    val copyright: String,
    val mediametadata: List<MediaMetadataX>,
    val subtype: String,
    val type: String
)