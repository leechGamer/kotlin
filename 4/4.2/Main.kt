class Name(val firstName: String, val familyName: String?)

class Person(val name: Name?) {
    fun describe(): String {
        val currentName = name ?: return "Unknown"
        return "${currentName.firstName} ${currentName.familyName}"
    }
}

fun main() {
    println(Person(Name("jh", "kim")).describe())
    println(Person(null).describe())
}
