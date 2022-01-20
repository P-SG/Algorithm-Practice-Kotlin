package 연습문제

fun main() {
    println(solution2(118372))
}

fun solution2(n: Long): Long {
    var answer = ""
    val str = n.toString()
    val arr = Array(str.length) {""}
    for (i in str.indices){
        arr[i] = str[i].toString()
    }
    arr.sort()
    arr.reverse()
    for (i in arr){
        answer += i
    }
    return answer.toLong()
}