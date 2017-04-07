import java.util.Scanner;

public class Zad02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prod = scanner.nextLine();
        String city = scanner.nextLine();
        double quant = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (prod.equals("coffee")) {
                System.out.println(0.50 * quant);
            } else if (prod.equals("water")) {
                System.out.println(0.80 * quant);
            } else if (prod.equals("beer")) {
                System.out.println(1.20 * quant);
            } else if (prod.equals("sweets")) {
                System.out.println(1.45 * quant);
            } else if (prod.equals("peanuts")) {
                System.out.println(1.60 * quant);
            }
        } else if (city.equals("Plovdiv")) {
            if (prod.equals("coffee")) {
                System.out.println(0.40 * quant);
            } else if (prod.equals("water")) {
                System.out.println(0.70 * quant);
            } else if (prod.equals("beer")) {
                System.out.println(1.15 * quant);
            } else if (prod.equals("sweets")) {
                System.out.println(1.30 * quant);
            } else if (prod.equals("peanuts")) {
                System.out.println(1.50 * quant);
            }
        } else if (city.equals("Varna")) {
            if (prod.equals("coffee")) {
                System.out.println(0.45 * quant);
            } else if (prod.equals("water")) {
                System.out.println(0.7 * quant);
            } else if (prod.equals("beer")) {
                System.out.println(1.10 * quant);
            } else if (prod.equals("sweets")) {
                System.out.println(1.35 * quant);
            } else if (prod.equals("peanuts")) {
                System.out.println(1.55 * quant);
            }
        }
    }
}
