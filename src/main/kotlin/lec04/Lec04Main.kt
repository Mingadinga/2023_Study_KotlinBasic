package lec04

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1

    if (money1 > money2) {
        println("Money1이 Money2보다 비쌉니다")
    }

    if (money3 === money1) {
        println("주소가 같습니다")
    }

    if (fun1() || fun2()) {
        println("본문")
    }

    val money4 = money1 + money2
    println(money4)

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
