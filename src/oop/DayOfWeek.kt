package oop

// Константы занимают меньше памяти
enum class DayOfWeek(val wakeUpTime: Int) {
    MONDAY(7), TUESDAY(7), WEDNESDAY(7),
    THURSDAY(8), FRIDAY(8),
    SATURDAY(9), SUNDAY(9)
}