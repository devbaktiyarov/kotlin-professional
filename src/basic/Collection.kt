package basic

// Используйте абстракции вместо реализаций
// По умолчанию базовые интерфецсы коллекции неизменяемые
// чтобы сделать их изменяемыми необходимо использовать интерфецс с приставкой Mutable
// К элементам коллекции можно обращаться, как к элементам массива через []
// listOf, setOf, mapOf, arrayOf - быстрая инициализация

fun main() {
//  Массив - коллекция данных фиксированной длины
    val array: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
    array[4] = 10
    array[4] = null
    println(array[1])
    val nullArray = arrayOfNulls<Int?>(5)

    val listOfNumbers: List<Int> = ArrayList<Int>() //: List<Int> - легко изменить реализацию
    // не нарушая стуктуру кода и с минимальными затратами
    // List immutable
//    listOfNumbers.add(22)
//    println(listOfNumbers[0])
    val mutableList: MutableList<Int> = ArrayList<Int>()
    mutableList.add(41)
    mutableList.add(42)
    println(mutableList[1])

    val mutableListOfNumbers: MutableList<Int> = mutableListOf()
    mutableListOfNumbers.add(1)
    println(mutableList[0])
}
