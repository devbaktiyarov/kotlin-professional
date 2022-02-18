package basic

fun main() {
    println(max(4, 6))
    println(findFiveWords("Kotlin"))
    println(sum(1, 2, 3, 4))

    var arr = arrayOf(3, 4, 1, 5, 8, 1)
    sort(arr)
    for (i in arr) {
        println(i)
    }
}

//fun max(a: Int, b: Int) : Int {
//    if (a > b)
//        return a;
//    else
//        return b;
//}

//fun max(a: Int, b: Int): Int {
//    return if (a > b)
//        a
//    else
//        b
//}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun findFiveWords(s: String): String = s.substring(0, Math.min(5, s.length))

fun sum(vararg numbers: Int): Int {
    var res = 0
    for (i in numbers) {
        res += i
    }
    return res
}

fun sort(array: Array<Int>): List<Int> {
    for (i in 0 until array.size) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) { // O(1)
                var temp: Int = array[j]; // O(1)
                array[j] = array[j + 1]; // O(1)
                array[j + 1] = temp; // O(1)
            }
        }
    }

    val list: List<Int> = array.toList();
    return list
}