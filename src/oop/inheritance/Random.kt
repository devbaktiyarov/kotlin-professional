package oop.inheritance

class Random {
    companion object {
        fun randomInt(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt()
        fun randomBoolean() = randomInt(0, 1) > 0
    }
}