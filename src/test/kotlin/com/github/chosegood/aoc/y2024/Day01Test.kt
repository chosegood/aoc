package com.github.chosegood.aoc.y2024.y2024

import com.github.chosegood.aoc.y2024.Day01
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Day01Test {

    @Test
    fun part1() {
        val input: List<String> = listOf(
            "3   4",
            "4   3",
            "2   5",
            "1   3",
            "3   9",
            "3   3",
        )
        expectThat(Day01.part1(input))
            .isEqualTo(11)
    }

    @Test
    fun part2() {
        val input: List<String> = listOf(
            "3   4",
            "4   3",
            "2   5",
            "1   3",
            "3   9",
            "3   3",
        )
        expectThat(Day01.part2(input))
            .isEqualTo(31)
    }
}