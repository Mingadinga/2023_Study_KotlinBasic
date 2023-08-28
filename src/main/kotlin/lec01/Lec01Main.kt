package lec01

fun main() {

    /**
     * var : 가변
     * val : 불변
     */
    var number1 = 10L // 가변
    val number2 = 10L // 불변

    number1 = 5L
//    number2 = 10L // 불가능

    /**
     * 타입 작성
     * [var|val] name: [TYPE] = value
     */

    var number: Long = 10L

    /**
     * var 초기화 없이 선언만 하기
     * 타입을 함께 선언해야함
     */

//    var number3
    var number3: Long

    /**
     * val 지연 로딩(?)
     * 아직 초기화하지 않은 val에 대해 최초 한번 값을 할당 가능
     */
    val number4: Long
    number4 = 5L


    /**
     * 코드에서는 참조 타입으로 보이지만,
     * 실행 시에 컴파일러가 Primitive 타입으로 변환한다
     * 즉, 프로그래머가 박싱과 언박싱을 고려하지 않아도 되도록 처리해줌
     */

    var number5: Long = 10L
    var number6: Long = 10L

    /**
     * null을 포함할 수 있는 타입 : [TYPE]?
     */
    var number7: Long? = 10L
    number7 = null

    var number8: Long = 10L
//    number8 = null // null을 참조할 수 없음

    /**
     * 객체 인스턴스화할 때 new를 사용하면 안됨
     */
    val person = Person("민휘")
    println(person.name)

}