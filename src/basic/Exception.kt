package basic

// Выражение может возвращать значение

fun main() {
    println(sum("21", "3"))
    println(sum("1", "three"))
}

fun sum(a: String, b: String): Int {
//    try {
//        val numberA = a.toInt();
//        val numberB = b.toInt();
//        return numberA + numberB
//    } catch (e: Exception) {
//        return 0;
//    }
    return try {
        val numberA = a.toInt();
        val numberB = b.toInt();
        numberA + numberB
    } catch (e: Exception) {
        0
    }
}