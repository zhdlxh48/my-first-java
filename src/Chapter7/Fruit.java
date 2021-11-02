package Chapter7;

public class Fruit {
  public String name;
  public int weight;
  public int price;

  public Fruit() {
    name = "";
    weight = 0;
    price = 0;
  }

  public Fruit(String name, int weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public String toString() {
    return "{" + "\n" + "\tname: " + name + "\n" + "\tweight: " + weight + "\n" + "\tprice: " + price + "\n" + "}";
  }
}
