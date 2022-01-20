fun main() {
    val arr1 = arrayOf(intArrayOf(1,2),intArrayOf(2,3))
    val arr2 = arrayOf(intArrayOf(3,4),intArrayOf(5,6))
    println(solution(arr1, arr2))
}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val answer = Array(arr1.size) { IntArray(arr1[0].size) }

    for (i in arr1.indices){
        for (j in arr1[i].indices){
            answer[i][j] = arr1[i][j] + arr2[i][j]
        }
    }

    return answer
}