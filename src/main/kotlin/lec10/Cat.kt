package lec10

class Cat (
    species: String // species를 초기화하는 생성자
) : Animal(species, 4) { // 상위 생성자 호출

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }

}