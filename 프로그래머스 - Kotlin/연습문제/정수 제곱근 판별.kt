package 연습문제

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println(solution1(121.toLong()))
}

fun solution1(n: Long): Long = if (sqrt(n.toDouble()) - sqrt(n.toDouble()).toInt() == 0.toDouble() ) (sqrt(n.toDouble()) + 1).pow(2).toLong() else -1
