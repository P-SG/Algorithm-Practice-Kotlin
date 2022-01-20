fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    solution(a,b)
}

fun solution(a:Int,b:Int){
    for (i in 0 until b){
        for (j in 0 until a){
            print("*")
        }
        println()
    }
}