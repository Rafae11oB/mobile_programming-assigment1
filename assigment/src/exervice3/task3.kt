package exervice3

fun perform(n1: Int, n2: Int, action: (Int, Int) -> Int) {
    println(action(n1, n2))
}

fun main() {
    perform(100, 40, { n1: Int, n2: Int -> n1 * n2 })
}