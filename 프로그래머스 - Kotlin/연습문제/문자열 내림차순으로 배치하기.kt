package 연습문제

fun main() {
    println(solution2("Zbcdefg"))

}

fun solution2(s: String): String {
    var answer = ""
    val lArr = arrayListOf<String>()
    val uArr = arrayListOf<String>()

    for (i in s.indices){
        if (s[i].isUpperCase()) uArr.add(s[i].toString()) else lArr.add(s[i].toString())
    }
    if (lArr.size > 1){
        lArr.sort()
        lArr.reverse()
    }
    if (uArr.size > 1){
        uArr.sort()
        uArr.reverse()
    }

    for (i in lArr){
        answer += i
    }
    for (i in uArr){
        answer += i
    }

    return answer
}