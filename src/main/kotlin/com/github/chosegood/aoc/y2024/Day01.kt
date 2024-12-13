package com.github.chosegood.aoc.y2024

import com.github.chosegood.aoc.AdventOfCode
import com.github.chosegood.aoc.InputReader

class Day01 : AdventOfCode {

    override fun part1(input: List<String>): Long {
        val (firstList, secondList) = input.map {
            val split = it.split(" ").filter(String::isNotBlank)
            split[0].toLong() to split[1].toLong()
        }.unzip()

        return firstList.sorted()
            .zip(secondList.sorted())
            .sumOf { (first, second) ->
                if (first > second) first - second else second - first
            }
    }

    override fun part2(input: List<String>): Long {
        val (firstList, secondList) = input.map {
            val split = it.split(" ").filter(String::isNotBlank)
            split[0].toLong() to split[1].toLong()
        }.unzip()

        return firstList.sumOf {
            it * secondList.count { n -> n == it }
        }
    }
}

fun main() {
    println(Day01().part1(InputReader.readInput("D0101_input.txt")))
    println(Day01().part2(InputReader.readInput("D0102_input.txt")))
}
