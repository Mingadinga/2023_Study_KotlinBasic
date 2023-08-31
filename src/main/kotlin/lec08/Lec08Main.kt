package lec08

fun main() {
    repeat(str = "new", num = 2, useNewLine = false)
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int): Int =
    if (a > b) a else b

fun repeat(str: String,
           num: Int,
           useNewLine: Boolean = true) {
    for (i in 1..num) {
        if(useNewLine) println(str)
        else print(str)
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        print(str)
    }
}