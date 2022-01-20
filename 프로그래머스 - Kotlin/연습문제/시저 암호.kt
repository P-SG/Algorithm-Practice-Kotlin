package 연습문제

import java.util.regex.Pattern

fun main() {
    println(solution("... h z", 20))
}

fun solution(s: String, n: Int): String {
    var answer = ""
    val strListU = Array(26) { "" }
    val strListL = Array(26) { "" }

    for (i in strListU.indices){
        strListU[i] = (65+i).toChar().toString().toUpperCase()
        strListL[i] = (65+i).toChar().toString().toLowerCase()
    }

    for (i in s.indices){
        if (!Pattern.matches("^[a-zA-Z]*$",s[i].toString())){
            answer += s[i]
            continue
        }
        if (s[i].isUpperCase()){
            for (j in strListU.indices){
                if (s[i].toString() == strListU[j]){
                    answer += if (strListU.lastIndex < j+n){
                        val index = (j+n) - (strListU.lastIndex+1)
                        strListU[0+(index)]
                    } else {
                        strListU[j+n]
                    }
                }
            }
        } else {
            for (j in strListL.indices){
                if (s[i].toString() == strListL[j]){
                    answer += if (strListL.lastIndex < j+n){
                        val index = (j+n) - (strListU.lastIndex+1)
                        strListL[0+(index)]
                    }else{
                        strListL[j+n]
                    }
                }
            }
        }
    }

    return answer
}