package lec12

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address
            get() = this@House.address
    }
}