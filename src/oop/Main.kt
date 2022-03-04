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

    val car = Car("Tesla", "Tesla Model 3", 2016)
    car.yearOfManufacture = 2017
    println(car.yearOfManufacture)
    car.printInfo()
    val secondCar = Car("Tesla", "Tesla Model 3", 2017)
    println(secondCar.isOld)

    println()

    println(car)
    println(secondCar)

    println(car.hashCode())
    println(secondCar.hashCode())

    println(car === secondCar)
    println(car == secondCar)

    val(brand, model, year) = car
    println(brand)
}

fun Car.printInfo() {
    println("Brand: $brand Model: $model Year of manufacture: $yearOfManufacture")
}