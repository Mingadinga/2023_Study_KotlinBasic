package lec19;

public class Fruit {

  private final long id;
  private final String name;
  private final int price;

  public Fruit(long id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public boolean isApple() {
    return this.name.equals("사과");
  }

}
