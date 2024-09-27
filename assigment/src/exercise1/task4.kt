package exercise1

fun main() {
    val l = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sum = 0
    for (n in l) {
        sum += n
    }
    println("sum = $sum")
}