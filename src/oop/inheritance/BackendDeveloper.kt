package oop.inheritance

class BackendDeveloper : Developer(), RepairComputer {
    override fun writeCode() {
        println("Write backend")
    }

    override fun buildСomputer() {
        println("Build a computer")
    }
}