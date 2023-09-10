package lec13

sealed class Car (
    val name: String,
    val price: Long)

class Avante: Car("아반떼", 1000L)
class Sonata: Car("소나타", 2000L)
class Grandeur: Car("그렌저", 3000L)

fun handleCar(car: Car) {
    when(car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}