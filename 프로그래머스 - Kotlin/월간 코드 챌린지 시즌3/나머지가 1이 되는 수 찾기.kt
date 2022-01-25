package 연습문제

fun main() {
    println(solution1(10))
}

fun solution1(n: Int): Int {
    var answer = 1
    while (n % answer != 1) answer++
    return answer
}