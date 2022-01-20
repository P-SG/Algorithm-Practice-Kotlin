fun main() {
    val arr = intArrayOf(1, 2, 3, 4)
    println(solution(arr))
}

fun solution(arr: IntArray): Double {
    var answer = 0.0
    for (i in arr) {
        answer += i
    }
    answer /= arr.size
    return answer
}