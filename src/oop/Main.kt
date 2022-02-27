package oop

fun main() {
    val user = User()
//    user.setName("Henry")
//    user.setAge(25)
//    println("Name ${user.getName()} Age: ${user.getAge()}")
    user.name = "Henry"
    user.age = 25
    println("Name ${user.name} Age: ${user.age}")

    val dog = Dog()
    dog.name = "Rex"
    dog.age = -1
    dog.weight = 10.1f
    println("Name ${dog.name} Age: ${dog.age} Weight: ${dog.weight}")

}