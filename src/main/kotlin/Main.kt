package com.rarnu.ws

import java.io.File

private fun printHelp() {
    println("Usage: localizer <version> <path>\n")
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        printHelp()
        return
    }
    // 内部资源版本号
    var ver = args[0]
    if (ver == "0") {
        ver = "6.6.6-b205"
    }
    val folder = args[1]
    // 要处理的目录
    val fDir = File(folder)
    if (!fDir.exists() || !fDir.isDirectory) {
        printHelp()
        return
    }

    // 替换资源为本地资源
    fDir.listFiles()?.forEach { file ->
        if (file.extension == "html") {
            ResourceReplacer.replace(file, ver)
        }
    }

    // 拷贝资源到目录
    ResourceCopier.copyAllRes(fDir)

}