package lec05.lec10

interface Swimable {

    val swimAbility: Int
        get() = 3 // default

    fun act() {
        System.out.println("어푸 어푸");
    }
    fun swim()
}