package basic

private var name: String? = null

private var surname: String? = "Band"
private var nickname: String? = "Alex"


fun main() {
//    По умолчанию все обьекты не могут содержать null
//    Чтобы обект сделать nullable нужно добавить ? после указания типа - String?
//    Вызвать метод у nullable обьекта можно двуми способами:
//    1. variableName!!.method() - небезопасный, не рекомендован к использованию
//    2. variableName?.method() - безопасный, эквивалентен проверке на null
//    Чтобы установить значение по умолчанию вместо null, используется оператор элвис:
//    variableName?.method() ?: 0
//    print(name!!.length)
    println(name?.length)

    val length = name?.length?.toString()
    val l = name?.length ?: 0
    println(length)
    println(l)

    val nameLength = name?.length ?: 0
    val surnameLength = surname?.length ?: 0
    val nicknameLength = nickname?.length ?: 0
    println("Sum: " + (nameLength + surnameLength + nicknameLength))
//
    val result = (name?.length ?: 0) + (surname?.length ?: 0) + (nickname?.length ?: 0)
    print("Result sum: $result")
}