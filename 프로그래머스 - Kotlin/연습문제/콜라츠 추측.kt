package 연습문제

fun main() {
    solution4(6)
}

fun solution4(num: Int): Int {
    var n = num
    if (n == 1) return 0
    for (i in 1..500) {
        n = if (n % 2 == 0) n / 2 else (n * 3) + 1
        if (n == 1) {
            return i
        }
    }

    return -1
}