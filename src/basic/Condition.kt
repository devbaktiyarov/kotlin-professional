package basic

fun main() {

    val temperature = 70
    val stateOfWater = if (temperature == 0) {
        "Твердое"
    } else if (temperature in 0..100) {
//        "Жидкое"
//        Unit (Kotlin) == Void (Java)
    } else {
        "Газообразное"
    }
    println(stateOfWater)



//    when
    val nameOfMonth = "Март"
    val indexOfMonth = 6
    val season: String = when (indexOfMonth) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Не найдено"
    }

//    val season: String = when(nameOfMonth) {
//        "Декабрь", "Январь", "Февраль" -> "Зима"
//        "Март", "Апрель", "Май" -> "Весна"
//        "Июнь", "Июль", "Август" -> "Лето"
//        "Сентябрь", "Октябрь", "Ноябрь" -> "Осень"
//        else -> "Не найдено"
//    }
//    when(nameOfMonth) {
//        "Декабрь", "Январь", "Февраль" -> season = "Зима"
//        "Март", "Апрель", "Май" -> season = "Весна"
//        "Июнь", "Июль", "Август" -> season = "Лето"
//        "Сентябрь", "Октябрь", "Ноябрь" -> season = "Осень"
//        else -> season = "Не найдено"
//    }

    println(season)

    val temp = 80
//    val state: String = if(temp < 0) {
//        "Твердое"
//    } else if (temp < 100) {
//        "Жидкое"
//    } else {
//        "Газообразное"
//    }

    val state: String = when {
        temp < 0 -> "Твердое"
        temp in 0..100 -> "Жидкое"
        else -> "Газообразное"
    }

    println(state)

    val hour = 10
    val weatherIsGood = true
    when {
        hour in 6..16 && weatherIsGood -> println("Сейчас день и погода хорошая - гулять")
        hour in 6..16 && weatherIsGood -> println("Сейчас день и погода плохая - читать книгу")
        else -> println("Спать")
    }



}