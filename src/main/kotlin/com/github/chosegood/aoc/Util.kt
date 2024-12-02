package com.github.chosegood.aoc

import java.io.FileNotFoundException
import kotlin.io.path.Path
import kotlin.io.path.readText


class Util {
    companion object {
        fun readInput(fileName: String): List<String> {
            val resource = Util::class.java.classLoader.getResource(fileName)
                ?: throw FileNotFoundException("$fileName not found")
            return Path(resource.path).readText().trim().lines()
        }
    }
}