package lec04;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);

    if (money1.compareTo(money2) > 0) {
      System.out.println("Money1이 Money2보다 비쌉니다");
    }

    System.out.println(money1.plus(money2));

  }

}
