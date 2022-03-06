package oop.inheritance

open class Bicycle(val gear: Int, var speed: Int) {

    open fun ride() {
        println("Ride in the city")
    }
}