package basic

fun main() {
//    val array = arrayOfNulls<Int?>(100)
//    for (i in 0 until array.size) {
//        array[i] = i
//    }
//    for (i in array) {
//        println(i)
//    }

//    for (i in 100 downTo 0 step 2) { // для того чтобы  пройти вниз по массиву используется констукция downTo
//        println(i)
//    }
    println()
    val arrayOfNumbers = arrayOfNulls<Int?>(100)
    for (i in 0 until arrayOfNumbers.size) {
        arrayOfNumbers[i] = i
    }

    for((index, i) in arrayOfNumbers.withIndex()) {
        arrayOfNumbers[index] = i?.times(2)
    }

    for (i in arrayOfNumbers) {
        println(i)
    }


    val arr = arrayOfNulls<Int>(301)
    for ((index, i) in (300..600).withIndex()) {
        arr[index] = i
    }

    for (i in arr.size - 1 downTo 0 step 5) {
        println(arr[i])
    }
}