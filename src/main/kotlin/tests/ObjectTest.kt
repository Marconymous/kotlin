package tests

object Person {
    var name: String? = null
    var age: Int = 0

    override fun toString(): String {
        return "{name: $name, age: $age}"
    }
}

fun main() {
    val persObj = Person
    persObj.name = "Marconymous"
    persObj.age = 16

    println(persObj)
}