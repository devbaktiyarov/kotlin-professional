package oop

// === - сравнение ссылок
// == - сравнение обьектов

// Data class
// Переопределены: toString(), hashCode(), equals(), component1()..., copy()

data class Car(var brand: String, var model: String, var yearOfManufacture: Int) { // Первичный конструктор

//    val isOld = yearOfManufacture < 2000
    val isOld: Boolean
        get() = yearOfManufacture >= 2000

    constructor(): this("", "", 0) {
    }

//    operator fun component1() = brand
//    operator fun component2() = model
//    operator fun component3() = yearOfManufacture

//    var brand: String
//    var model: String
//    var yearOfManufacture: Int
//
//    constructor(brand: String, model: String, yearOfManufacture: Int) {
//        this.brand = brand
//        this.model = model
//        this.yearOfManufacture = yearOfManufacture
//    }
//
}