package 연습문제

fun main() {
    println(solution2(12))
}

fun solution2(n: Int): Int {
    var answer = 0
    for (i in 1..n){ // 정수는 0으로 나눌 수 없음 (ArithmeticException)
        if (n % i == 0){
            answer += i
        }
    }
    return answer
}