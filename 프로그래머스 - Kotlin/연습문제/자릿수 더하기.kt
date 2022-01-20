package 연습문제

fun main() {
    println(solution(123))

}

fun solution(n: Int): Int {
    var answer = 0
    val str = n.toString()
    for (i in str.indices){
         answer += str[i]-'0'
    }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    println("Hello Kotlin")

    return answer
}