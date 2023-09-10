package lec12;

public class Lec12MainJava {
    public static void main(String[] args) {
        Person.Factory.newBaby("abc"); // Companion Object를 통해 호출
        Person.newBaby("abc"); // @JvmStatic
    }
}
