package com.malibin.study.domain.lotto.cal

class AverageCalculator {
    fun calculateAverage(numbers: List<Int>): Int {
        return numbers.sum() / numbers.size
    }
}