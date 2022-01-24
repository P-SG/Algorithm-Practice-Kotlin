package 연습문제

fun main() {
    println(solution3(10))
}

// fold(초기값,계산식)
fun solution3(x: Int): Boolean = x % x.toString().fold(0) { acc, c -> acc + (c - '0') } == 0



