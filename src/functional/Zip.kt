package functional

fun main() {
    val characters = mutableListOf<String>()
    val hp = mutableListOf<Int>()
    for (i in 0..100) {
        characters.add("Character №$i")
        hp.add((Math.random() * 100).toInt())
    }

    val scoreTable = characters.zip(hp)
    for (score in scoreTable) {
        println("Character: ${score.first} HP: ${score.second}")
    }

    val names = arrayOf("Joe", "Niko", "Ezra")
    val surnames = arrayOf("Jones", "Lopes", "Belal")

    val info: List<Pair<String, String>> = names.zip(surnames)

//    При использовании flatMap мы уже получаем развернутую коллекцию

    val data = mutableMapOf<String, List<Int>>()
//    data.put("log", listOf(11, 22, 33))
    data["log"] = listOf(11, 22, 33)

    val folder = mapOf<String, List<Int>>(
        "photo" to listOf(1, 2, 3),
        "music" to listOf(2, 2, 3)
    )

    val average = folder.flatMap { it.value }.average()
    println(average)

    val app = mapOf(
        Pair("camera", listOf(12, 22, 48))
    )
}