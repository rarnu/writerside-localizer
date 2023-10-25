package com.rarnu.ws

import java.io.File

object ResourceCopier {

    private val resList = listOf(
        "app.css",
        "app.js",
        "apple-touch-icon.png",
        "en-US-translation.js",
        "favicon-16x16.png",
        "favicon-32x32.png",
        "icon-512.png",
        "JetBrainsSans-Light.woff",
        "JetBrainsSans-Light.woff2",
        "JetBrainsSans-Regular.woff",
        "JetBrainsSans-Regular.woff2",
        "JetBrainsSans-SemiBold.woff",
        "JetBrainsSans-SemiBold.woff2",
        "JetBrainsSans.woff",
        "JetBrainsSans.woff2",
        "mstile-70x70.png",
        "mstile-144x144.png",
        "mstile-150x150.png",
        "mstile-310x150.png",
        "mstile-310x310.png",
        "site.webmanifest"
    )

    fun copyAllRes(fDir: File) {
        resList.forEach { res ->
            val bytes = javaClass.getResourceAsStream("/$res").use { it?.readAllBytes() }
            if (bytes != null) File(fDir, res).writeBytes(bytes)
        }
    }

}