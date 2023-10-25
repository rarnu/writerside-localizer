package com.rarnu.ws

import java.io.File

object ResourceReplacer {

    fun replace(file: File, ver: String) {

        var text = file.readText()
        text = text.replace("https://resources.jetbrains.com/writerside/apidoc/$ver/app.css", "app.css")
        text = text.replace("https://resources.jetbrains.com/writerside/apidoc/$ver/app.js", "app.js")

        text = text.replace("https://jetbrains.com/apple-touch-icon.png", "apple-touch-icon.png")
        text = text.replace("https://jetbrains.com/favicon-32x32.png", "favicon-32x32.png")
        text = text.replace("https://jetbrains.com/favicon-16x16.png", "favicon-16x16.png")
        text = text.replace("https://jetbrains.com/site.webmanifest", "site.webmanifest")
        text = text.replace("https://jetbrains.com/safari-pinned-tab.svg", "safari-pinned-tab.svg")
        text = text.replace("https://resources.jetbrains.com/storage/ui/favicons/mstile-144x144.png", "mstile-144x144.png")
        text = text.replace("https://resources.jetbrains.com/storage/ui/favicons/mstile-70x70.png", "mstile-70x70.png")
        text = text.replace("https://resources.jetbrains.com/storage/ui/favicons/mstile-150x150.png", "mstile-150x150.png")
        text = text.replace("https://resources.jetbrains.com/storage/ui/favicons/mstile-310x150.png", "mstile-310x150.png")
        text = text.replace("https://resources.jetbrains.com/storage/ui/favicons/mstile-310x310.png", "mstile-310x310.png")

        file.writeText(text)
    }

}