package oop

class User {

//    private var name: String? = null
//    private var age: Int = 0

//    fun setName(name: String) {
//        this.name = name
//    }
//
//    fun getName() = name

    //    fun setAge(age: Int) {
//        this.age = age
//    }
//
//    fun getAge() = age
    var name: String? = null
        get() {
            return if (field == null) {
                ""
            } else {
                field
            }
        }

    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}