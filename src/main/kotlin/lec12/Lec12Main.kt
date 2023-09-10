package lec12

class Lec12Main {
    fun main() {
        moveSomething(object : Movable {
            override fun move() {
                println("move")
            }

            override fun fly() {
                println("fly")
            }
        })
    }
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}