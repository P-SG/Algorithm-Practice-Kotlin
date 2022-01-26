package `월간 코드 챌린지 시즌1`

fun main() {
    println(solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2)))
}

fun solution(a: IntArray, b: IntArray): Int = a.foldIndexed(0) { index, acc, i -> acc + (i * b[index]) }
