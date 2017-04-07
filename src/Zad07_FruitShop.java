import java.util.Scanner;

public class Zad07_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quant = Double.parseDouble(scanner.nextLine());

        if (day.equals("monday") ||
                day.equals("tuesday") ||
                day.equals("wednesday") ||
                day.equals("thursday") ||
                day.equals("friday")) {
            if (fruit.equals("banana")) {
                System.out.println(quant * 2.50);
            } else if (fruit.equals("apple")) {
                System.out.println(quant * 1.20);
            } else if (fruit.equals("orange")) {
                System.out.println(quant * 0.85);
            } else  if (fruit.equals("grapefruit")) {
                System.out.println(quant * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quant * 2.70);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quant * 5.50);
            } else if (fruit.equals("grapes")) {
                System.out.println(quant * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(quant * 2.70);
            } else if (fruit.equals("apple")) {
                System.out.println(quant * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(quant * 0.90);
            } else  if (fruit.equals("grapefruit")) {
                System.out.println(quant * 1.60);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quant * 3.00);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quant * 5.60);
            } else if (fruit.equals("grapes")) {
                System.out.println(quant * 4.20);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
