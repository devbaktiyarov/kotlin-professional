package oop.inheritance

class Calculator {

    companion object {
        fun convertDegreesToRadians(degree: Double) = degree * (PI / 180)
        fun convertRadiansToDegrees(radians: Double) = radians * 180 / PI
    }

}