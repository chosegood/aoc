package com.github.chosegood.aoc.y2024

import com.github.chosegood.aoc.AdventOfCode
import com.github.chosegood.aoc.InputReader
import kotlin.math.abs

class Day02 : AdventOfCode {

    private fun allIncreasing(levels: List<Long>) = levels.zipWithNext { a, b -> a > b }.all { it }
    private fun allDecreasing(levels: List<Long>) = levels.zipWithNext { a, b -> a < b }.all { it }
    private fun levelsSafe(levels: List<Long>): Boolean {
        val stepDifferences = levels.zipWithNext { a, b -> abs(a - b) }
        val levelsSafe = stepDifferences.all { it <= 3 } && (allIncreasing(levels) || allDecreasing(levels))
        return levelsSafe
    }

    override fun part1(input: List<String>): Long = input.sumOf { it ->
        val levels = it.split(" ").map { it.toLong() }
        if (levelsSafe(levels)) 1L else 0L
    }

    override fun part2(input: List<String>): Long = input.sumOf { it ->
            val levels = it.split(" ").map { it.toLong() }
        val anySafeSkippingAnElement = levels.indices.any { i ->
            levelsSafe(levels.toMutableList().apply { removeAt(i) })
        }
        if (anySafeSkippingAnElement) 1L else 0L
    }
}

fun main() {
    println(Day02().part1(InputReader.readInput("D0201_input.txt")))
    println(Day02().part2(InputReader.readInput("D0202_input.txt")))
}
