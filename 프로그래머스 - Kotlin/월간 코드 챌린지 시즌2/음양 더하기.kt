package `월간 코드 챌린지 시즌2`

fun main() {

    println(solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true)))
}

fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer = 0
    for(i in absolutes.indices) {
        if (signs[i]) answer += absolutes[i] else answer -= absolutes[i]
    }

    return answer
}

//  fun solution(absolutes: IntArray, signs: BooleanArray): Int = absolutes.foldIndexed(0) { index, acc, i -> acc + if (signs[index]) i else -i }