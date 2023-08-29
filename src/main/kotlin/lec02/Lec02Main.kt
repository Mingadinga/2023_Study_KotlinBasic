package lec02;

fun main() {
        val person = Person("공부하는 개발자")
        startsWith(person.name)
}

fun startsWith(str: String): Boolean {
        return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A")
                ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
}

fun safeCall() {
        val str: String?= null
//        println(str.length); // 불가능
        println(str?.length ?: 0); // 가능
}

fun startsWithNotNull(str: String?): Boolean {
        return str!!.startsWith("A")
}