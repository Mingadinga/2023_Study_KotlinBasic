package lec20

data class Person (
    val name: String,
    val age: Int,
) {
    lateinit var hobby: String
}