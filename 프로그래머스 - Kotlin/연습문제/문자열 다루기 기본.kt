package 연습문제

fun main() {
    println(solution3("1234"))
}

fun solution3(s: String): Boolean = (s.length  == 4 || s.length == 6) && s.matches("^[0-9]+$".toRegex())

