package functional

fun main() {
//    val sum = {a: Int, b: Int -> a + b} // Анонимная функция = лямюда выражение
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    val resultSum = sum(2, 4)

    val square: (Int) -> Int = { a -> a * a }
    println(square(resultSum))

    val perimeter: (Double, Double) -> Double = {a: Double, b: Double -> (a + b) * 2}
    println(perimeter(10.2, 5.5))

    val hello: (String) -> Unit = {name -> println("Hello $name")}
    hello("James")

    val sort: (Array<Int>) -> Array<Int> = {
        for (i in 0 until it.size) {
            for (j in 0 until it.size - i - 1) {
                if (it[j] < it[j + 1]) { // O(1)
                    var temp: Int = it[j]; // O(1)
                    it[j] = it[j + 1]; // O(1)
                    it[j + 1] = temp; // O(1)
                }
            }
        }
        it
    }

    val sorted = sort(arrayOf(2, 3, 4, 5))
    for (i in sorted) {
        println(i)
    }
}