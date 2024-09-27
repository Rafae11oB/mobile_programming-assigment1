package exercise2

class Employee(
    name: String,
    age: Int,
    email: String,
    val salary: Int
) : Person(name, age, email) {
    override fun displayInfo() = println("name='$name', age=$age, email='$email', salary=$salary")
}

fun main() {
    val employee = Employee(
        name = "Rafael",
        age = 22,
        email = "rafael@example.com",
        salary = 1_000_000
    )
    employee.displayInfo()
}