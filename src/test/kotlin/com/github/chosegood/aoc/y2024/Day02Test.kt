package com.github.chosegood.aoc.y2024

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Day02Test {

    @Test
    fun part1() {
        val input: List<String> = listOf(
            "7 6 4 2 1",
            "1 2 7 8 9",
            "9 7 6 2 1",
            "1 3 2 4 5",
            "8 6 4 4 1",
            "1 3 6 7 9",
        )
        expectThat(Day02().part1(input))
            .isEqualTo(2)
    }

    @Test
    fun part2() {
        val input: List<String> = listOf(
            "7 6 4 2 1",
            "1 2 7 8 9",
            "9 7 6 2 1",
            "1 3 2 4 5",
            "8 6 4 4 1",
            "1 3 6 7 9",
        )
        expectThat(Day02().part2(input))
            .isEqualTo(4)
    }
}