package `월간 코드 챌린지 시즌2`

fun main() {
 println(solution(24,27))
}

fun solution(left: Int, right: Int): Int {
    var answer = 0
    val arr = arrayListOf<Int>()

    (left..right).map { (1..it).forEach { i -> if (it % i == 0) arr.add(i) } to  if (arr.size % 2 == 0) answer += it else answer -= it .apply { arr.removeAll(arr) } }
//    for (i in left..right){
//    for (j in 1..i){
//            if (i % j == 0) arr.add(j)
//        }
//        if (arr.size % 2 == 0) answer += i else answer -= i
//        arr.removeAll(arr)
//        println()
//    }
    return answer
//    return (left..right).map { i -> if ((1..i).filter { i % it == 0 }.size % 2 == 0) i else -i }.sum()
}