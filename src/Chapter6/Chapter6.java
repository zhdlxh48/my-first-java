package Chapter6;

public class Chapter6 {
  public static void main(String[] args) {
    int x = 10;

    if (x > 5) {
      System.out.println("x is less than 5");
    }

    if (x < 20) {
      System.out.println("x is less than 20");
    } else {
      System.out.println("x is larger or equal than 20");
    }

    if (x > 10) {
      System.out.println("x is larger than 10");
    } else if (0 <= x && x <= 10) {
      System.out.println("x is less or equal than 10, And x is larger or equal than 0");
    } else {
      System.out.println("x is negative");
    }

    switch (x) {
    case 100:
      System.out.println("x is 100");
      break;
    case 10:
      System.out.println("x is 10");
      break;
    case 1:
      System.out.println("x is 1");
      break;
    default:
      System.out.println("x is out of condition");
      break;
    }

    int score = 87;
    switch (score / 10) {
    case 10:
      System.out.println("Wow you get 100 score!");
      break;
    case 9:
      System.out.println("You get 90 score!");
      break;
    case 8:
      System.out.println("You get 80 score!");
      break;
    case 7:
      System.out.println("Oh.. you get 70 score");
      break;
    default:
      System.out.println("You are under 70 score...");
      break;
    }

    String name = "John";
    switch (name.toLowerCase()) {
    case "john":
      System.out.println("Your name is John");
      break;
    case "cherie":
      System.out.println("Your name is Cherie");
      break;
    default:
      System.out.println("Not in DB");
      break;
    }

    for (int i = 0; i < 10; i++) {
      System.out.println("Hello, for!");
    }

    for (int a = 3, b = 4, c = 5; a < 8 && b < 9 && c < 10; a++, b++, c++) {
      System.out.println(a + " " + b + " " + c);
    }

    int i = 0;
    while (i < 10) {
      System.out.println("Hello, while!");
      i++;
    }

    i = 0;
    do {
      System.out.println("Hello, do-while!");
    } while (i > 0);

    for (int num : new int[] { 1, 2, 3, 4 }) {
      System.out.println(num);
    }

    for (var fName : new String[] { "John", "Cherie", "McDonald" }) {
      System.out.printf("Name is %s\n", fName);
    }
  }
}
