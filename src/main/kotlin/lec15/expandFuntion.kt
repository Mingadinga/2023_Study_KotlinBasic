package lec15

// String 클래스를 확장한 확장 함수
fun String.lastChar() : Char {
    return this[this.length-1]
}

fun main() {
    val str = "Abc"
    println(str.lastChar())
}