package com.github.chosegood.aoc.y2024

import com.github.chosegood.aoc.AdventOfCode
import com.github.chosegood.aoc.InputReader

class Day01 : AdventOfCode {

    override fun part1(input: List<String>): Int {
            val map: List<Pair<Int, Int>> = input.map {
                val split = it.split(" ").filter(String::isNotBlank)
                split[0].toInt() to split[1].toInt()
            }
            val firstList = map.map { it.first }.sorted()
            val secondList = map.map { it.second }.sorted()

            var sum = 0
            for (index in 0 until firstList.size.coerceAtMost(secondList.size)) {
                val i = if (firstList[index] > secondList[index]) {
                    firstList[index] - secondList[index]
                } else {
                    secondList[index] - firstList[index]
                }
                sum += i
            }
            return sum
    }

    override fun part2(input: List<String>): Int {
        val map: List<Pair<Int, Int>> = input.map {
            val split = it.split(" ").filter(String::isNotBlank)
            split[0].toInt() to split[1].toInt()
        }
        val firstList = map.map { it.first }
        val secondList = map.map { it.second }

        return firstList.sumOf {
            val count = secondList.count { n -> n == it }
            it * count
        }

    }

}

fun main() {
    println(Day01().part1(InputReader.readInput("D0101_input.txt")))
    println(Day01().part2(InputReader.readInput("D0102_input.txt")))
}
