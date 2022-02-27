package oop

class Dog {
    var name: String = ""
        get() = field.toLowerCase().capitalize()

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Float = 0f
        set(value) {
            if (value >= 0) {
                field = value
            }
        }


}