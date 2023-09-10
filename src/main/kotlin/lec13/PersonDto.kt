package lec13

// equals, hashCode, toString을 자동으로 만들어줌
data class PersonDto(
    val name: String,
    val age: Int,
)

fun main() {
    PersonDto(name = "abc", age = 2)
}