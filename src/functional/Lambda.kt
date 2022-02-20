package functional

fun main() {
//    val sum = {a: Int, b: Int -> a + b} // Анонимная функция = лямюда выражение
//    val sum: (Int, Int) -> Int = { a, b -> a + b }
//    val resultSum = sum(2, 4)
//
//    val square: (Int) -> Int = { a -> a * a }
//    println(square(resultSum))
//
//    val perimeter: (Double, Double) -> Double = {a: Double, b: Double -> (a + b) * 2}
//    println(perimeter(10.2, 5.5))
//
//    val hello: (String) -> Unit = {name -> println("Hello $name")}
//    hello("James")
//
//    val sort: (Array<Int>) -> Array<Int> = {
//        for (i in 0 until it.size) {
//            for (j in 0 until it.size - i - 1) {
//                if (it[j] < it[j + 1]) { // O(1)
//                    var temp: Int = it[j]; // O(1)
//                    it[j] = it[j + 1]; // O(1)
//                    it[j + 1] = temp; // O(1)
//                }
//            }
//        }
//        it
//    }
//
//    val sorted = sort(arrayOf(2, 3, 4, 5))
//    for (i in sorted) {
//        println(i)
//    }

    val listOfNames = mutableListOf<String>("Andrew", "Tony", "Arnold", "Colby", "Max")
//    val listOfNamesStartWithA = listOfNames.filter { name -> name.startsWith("A") }
//    it - использовать когда один параметр
    val listOfNamesStartWithA = listOfNames.filter { it.startsWith("A") }

    for (name in listOfNamesStartWithA) {
        println(name)
    }

//    Map преобразует одну коллекцию в другую

    val numbers = (0..11).toList()
//    val doubledNumbers = numbers.map { number: Int -> number * 2 }
    val doubledNumbers = numbers.map { it * 2 }
    for (number in doubledNumbers) {
        println(number)
    }

    val players: List<String> = numbers.map { "Player №$it" }
    val sortedPlayers = players.sortedDescending()
    for (player in players) {
        println(player)
    }
    for (player in sortedPlayers) {
        println(player)
    }

    val listOfRandoms: MutableList<Int> = ArrayList<Int>()
    for (j in 0..999) {
        listOfRandoms.add((0..1000).random())
    }

    val resultList = listOfRandoms.filter { it % 5 == 0 || it % 3 == 0 }
        .map { it * it }.sortedDescending().map { "N = $it" }

    for (f in resultList) {
        println(f)
    }


}