package 연습문제


fun main(){
    println(solution("try hello world"))
}

fun solution(s: String): String {
    var answer = ""
    val list = s.split("").toMutableList()
    var index = 0

    for (i in list.indices){
        if (list[i] == ""){
            continue
        }else if (list[i] == " "){
           index = 0
       } else if (index % 2 == 0) {
           list[i] = list[i].toUpperCase()
           index++
       } else if (index % 2 != 0) {
           list[i] = list[i].toLowerCase()
           index++
       }
        answer += list[i]
    }

    return answer
}