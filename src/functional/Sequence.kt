package functional

// Ленивая инициализация - инициализация элемента только в тот момент, когда от он используетсяв  коде

fun main() {
//    val numbers = (1..20).toList()
//    val players = numbers.map{"Player $it"}
//    val team = players.dropLast(9).take(11)
//    for (i in team) {
//        println(i)
//    }

    val numbers = generateSequence (1) { it * 2}
    val listOfSquaredNumbers = numbers.take(5) // при drop() последовательность будет бесконечной
    for (i in listOfSquaredNumbers) {
        println(i)
    }


    val initArray = generateSequence (1) { it + 1 }
    val employees = initArray.map { "Сотрудник $it" }.take(100)
    for (e in employees) {
        println(e)
    }



}