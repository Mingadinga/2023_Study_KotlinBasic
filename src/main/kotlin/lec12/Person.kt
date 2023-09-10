package lec12

class Person (
    var name: String,
    var age: Int,
){

    // static 블록
     companion object Factory : Log {
         const val MIN_AGE = 1

        @JvmStatic
         fun newBaby(name: String): Person {
             return Person(name, MIN_AGE)
         }

        override fun log() {
            println("나는 Person 클래스의 동행객체에출")
        }
    }

}

object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a += 10
}