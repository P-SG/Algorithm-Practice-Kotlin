package 연습문제


fun main() {
    for (i in solution(arrayOf("abce", "abcd", "cdx"),2)){
        println(i)
    }
}

fun solution(strings: Array<String>, n: Int): Array<String> {
    return strings.also {
        it.sort() // it은 Array
        it.sortBy { s ->  s[n] } // 여기서 s는 String
    }
}