package exercise1

fun main() {
    val num: Int = readln().toInt()
    if (num > 0) {
        println("Positive")
    } else if (num == 0) {
        println("Zero")
    } else {
        println("Negative")
    }
}