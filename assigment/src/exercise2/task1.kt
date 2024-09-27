package exercise2

open class Person(
    val name: String,
    val age: Int,
    val email: String
) {
    open fun displayInfo() = println("name='$name', age=$age, email='$email'")
}

fun main() {
    val person = Person(
        name = "Rafael",
        age = 22,
        email = "rafael@example.com"
    )
    person.displayInfo()
}