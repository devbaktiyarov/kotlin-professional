package oop.inheritance

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

}