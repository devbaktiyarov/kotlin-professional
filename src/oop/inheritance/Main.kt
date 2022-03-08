package oop.inheritance

internal const val PI = 3.14 // доступен внутри модуля - public static final float PI = 3.14f

fun main() {
    val bicycle = Bicycle(1, 10)
    val bicycle2 = Bicycle(3, 10)
    val bicycle3 = Bicycle(2, 10)

    val mountainBike = MountainBike("rigid")
    mountainBike.speed = 10
    println("${mountainBike.gear}, ${mountainBike.speed}, ${mountainBike.design}")

    var bicycles = mutableListOf<Bicycle>(bicycle, bicycle2, bicycle3, mountainBike)

    for (bike in bicycles) {
        bike.ride()
    }

    val frontendDeveloper = FrontendDeveloper()
    val backendDeveloper = BackendDeveloper()
    var developers = mutableListOf(frontendDeveloper, backendDeveloper)

    for (developer in developers) {
        if (developer is RepairComputer) {
            developer.buildСomputer()
        }
        developer.writeCode()
    }

    code(object : Developer() {
        override fun writeCode() {
            println("Write any code")
        }
    })

    ride(object : Bicycle(1, 10) {
        override fun ride() {
            super.ride()
        }
    })

    val radians = Calculator.convertDegreesToRadians(47.0)
    println(radians)
    val degrees = Calculator.convertRadiansToDegrees(3.2)
    println(degrees)

    println(Random.randomInt(1, 200))
    println(Random.randomBoolean())

}

fun code(developer: Developer) {
    developer.writeCode()
}

fun ride(bicycle: Bicycle) {
    println(bicycle.gear)
    println(bicycle.speed)
    bicycle.ride();
}