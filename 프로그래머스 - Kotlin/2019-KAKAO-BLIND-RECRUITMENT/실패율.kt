import java.util.*

        fun solution(N: Int, stages: IntArray): IntArray {
            val answer = IntArray(N)
            var map = LinkedHashMap<Int,Double>()

            for (i in 1..N){ // 총 스테이지
                var x = 0 // 클리어하지 못한 사용자
                var y = 0 // 도전하고 성공한 사용자
                for (j in stages){ // 도전한 사용자
                    if (i <= j){
                        y++
                        if(i == j){
                            x++
                        }
                    }
                }
                map[i] = fountain(x,y)
            }

            val sortMap = map.toList().sortedByDescending { it.second }.toMap()

            if(map.size <= 1){
                for (i in map.keys) answer[0] = i
            } else {
                map = sortMap as LinkedHashMap<Int, Double>
                val arr = arrayListOf<Int>()
                for (j in map.keys){
                    arr.add(j)
                }
                for (i in arr.indices){
                    answer[i] = arr[i]
                }
            }

            return answer
        }

        private fun fountain(a:Int, b:Int): Double = if (a==0 && b==0) 0.0 else a/b.toDouble()


fun main() {
    val stages = intArrayOf(2, 1, 2, 4, 2, 4, 3, 3)
    val result = solution(1,stages)
    for (i in result){
        println(i)
    }
}