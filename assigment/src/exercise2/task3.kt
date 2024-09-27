package exercise2

class BankAccount {
    private var balance = 0

    fun deposit(value: Int) {
        balance += value
        showCurrentBalance()
    }

    fun withdraw(value: Int) {
        if (balance < value) {
            println("Balance can't be negative")
            return
        }
        balance -= value
        showCurrentBalance()
    }

    private fun showCurrentBalance() = println("Current balance: $balance")
}

fun main() {
    val bankAccount = BankAccount()
    bankAccount.deposit(100)
    bankAccount.withdraw(100)
    bankAccount.withdraw(1)
}