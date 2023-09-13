package lec18;

public class Fruit {

  private final String name;
  private final int price;
  public long id;

  public Fruit(int id, String name, int price) {
    this(name, price);
    this.id = id;
  }

  public Fruit(String name, int price) {
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
