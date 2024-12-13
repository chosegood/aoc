package com.github.chosegood.aoc.y2024

import com.github.chosegood.aoc.AdventOfCode
import com.github.chosegood.aoc.InputReader
import kotlin.math.abs

class Day02 : AdventOfCode {

    override fun part1(input: List<String>): Long {
        return input.sumOf { it ->
            val levels = it.split(" ").map { it.toLong() }
            val levelsSafe = safeIncreasing(levels) || safeDecreasing(levels)
            if (levelsSafe) 1L else 0L
        }
    }

    private fun safeIncreasing(levels: List<Long>): Boolean = levels.windowed(2, 1).all {
        val left = it[0]
        val right = it[1]
        left > right && abs(left - right) in 1..3
    }

    private fun safeDecreasing(levels: List<Long>): Boolean = levels.windowed(2, 1).all {
        val left = it[0]
        val right = it[1]
        left < right && abs(left - right) in 1..3
        }

    override fun part2(input: List<String>): Long {
        return input.sumOf { it ->
            val levels = it.split(" ").map { it.toLong() }
            val levelsSafe = safeIncreasing(levels) || safeDecreasing(levels)
            if (levelsSafe) 1L else 0L
        }
    }

}

fun main() {
    println(Day02().part1(InputReader.readInput("D0201_input.txt")))
    println(Day02().part2(InputReader.readInput("D0202_input.txt")))
}
