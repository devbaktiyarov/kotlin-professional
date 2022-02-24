package functional

val name: String? = "Kotlin"

fun main() {
    name?.let {
        if (name.length > 4) {
            println(it)
        }
    }

    val listWith: MutableList<Int>? = mutableListOf()
    listWith?.let {
        with(listWith) {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }

            val evenList = filter { it % 2 == 0 }.take(100)

            for (e in evenList) {
                println(e)
            }

        }
    }
}