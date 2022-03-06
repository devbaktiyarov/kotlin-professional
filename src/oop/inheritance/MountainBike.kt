package oop.inheritance

class MountainBike(val design: String): Bicycle(gear = 5, speed = 16) {

    override fun ride() {
        println("Ride in the mountains")
    }
}