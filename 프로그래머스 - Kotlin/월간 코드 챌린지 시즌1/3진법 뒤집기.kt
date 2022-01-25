package `월간 코드 챌린지 시즌1`

fun main() {
 println(solution(45))
}

fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)