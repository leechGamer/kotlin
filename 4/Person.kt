class Person (private val firstName: String, private val familyName: String) {
    inner class Possession(val description: String) {
        fun showOwner() = println(fullName())
    }
    private fun fullName() = "$firstName $familyName"
}

fun main() {
    val person = Person("john", "caporicci")
    val wallet = person.Possession("Wallet")
    wallet.showOwner()
}
