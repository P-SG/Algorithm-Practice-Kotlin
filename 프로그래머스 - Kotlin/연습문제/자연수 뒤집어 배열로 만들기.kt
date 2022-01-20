package 연습문제

fun main() {
    for (i in solution(12345.toLong())){
        println(i)
    }
}

fun solution(n: Long): IntArray {
    val answer = ArrayList<Int>()
    val str  = n.toString()
    for (i in str.length-1 downTo 0){
        answer.add(str[i]-'0')
    }

    return answer.toIntArray()
}