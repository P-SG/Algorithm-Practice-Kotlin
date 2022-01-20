fun main() {
    println(solution2(1,2))
}

fun solution2(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }