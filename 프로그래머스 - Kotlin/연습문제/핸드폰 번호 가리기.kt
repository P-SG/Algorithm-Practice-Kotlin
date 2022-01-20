fun main() {
    println(solution("01033334444"))
}

fun solution(phone_number: String): String {
    val lastNum = phone_number.substring(phone_number.length - 4, phone_number.length)
    val firstNum = phone_number.substring(0, phone_number.length - 4)
    var star = ""
    for (i in firstNum.indices) {
        star += "*"
    }

    return star + lastNum
}