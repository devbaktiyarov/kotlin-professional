fun main() {
    val jokes = mutableListOf<String>(
        "- Что делать? Что делать?! \n" +
                "- Думай! Что бы мы сделалали, будь у нас мозги",
        "- Вперед, дружище! Прыгни со скалы, посмотри в дуло пистолета, помочись против ветра! \n" +
                "- Джо, уверяю тебя, если на меня напрвят дуло пистолета, я начну мочиться во все стороны",
        "- Странная вещь: Дональд Дак не надевал штанов, но, выходя из душа, обвязывался полотенцем... " +
                "Спрашивается, почему?",
        "- Чендлер, у тебя отличные волосы!\n" +
                "- Спасибо, я сам их выращиваю",
        "Никто не знает, что больнее - родить ребенка или получить удар между ног..." +
                "Потому что ни один человек на свете не испытал и того, и другого",
        "- В этом году я буду счастлив, я сам сделаю себя счастливым!\n" +
                "- Нам выйти из комнаты или как?",
        "- Странно, мой босс тоже меня не любит.\n" +
                "- По-моему, меня мой тоже...\n" +
                "- Может, это закон природы?\n" +
                "- A может, это потому, что вы торчите в кафе в 11:30, когда за окном среда?",
        "- Кто-то украл мой сэндвич.\n- Что говорит полиция?",
        "- Это что внизу, пожарная тревога\n- Да. Пол еще не горячий, можно не спешить."
    )

    val random: Int = (Math.random() * jokes.size).toInt()
    println(jokes.get(random))

}