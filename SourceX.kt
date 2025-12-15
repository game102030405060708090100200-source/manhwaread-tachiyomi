package 
eu.kanade.tachiyomiorg.extension.en.sourcex

import eu.kanade.tachiyomi.extension.en.madara.Madara

class SourceX : Madara(
    name = "ManhwaRead",
    baseUrl = "https://manhwaread.com",
    lang = "en",
    dateFormat = "MMM d, yyyy"
) {
    override val useLoadMoreRequest = true
}
