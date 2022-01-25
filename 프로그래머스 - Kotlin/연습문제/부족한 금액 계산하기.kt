package 연습문제

fun main() {
    println(solution(400,1000,4))
}

fun solution(price: Int, money: Int, count: Int): Long = (1..count).sumOf { i-> i * price.toLong() }.let { l-> if (money > l) 0 else l - money }