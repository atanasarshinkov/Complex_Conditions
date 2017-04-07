import java.util.Scanner;

public class Zad04_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prod = scanner.nextLine();

        if (prod.equals("banana") || prod.equals("apple")
                || prod.equals("kiwi") || prod.equals("cherry")
                || prod.equals("lemon") || prod.equals("grapes")) {
            System.out.println("fruit");
        } else if (prod.equals("tomato") || prod.equals("cucumber")
                || prod.equals("pepper") || prod.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
