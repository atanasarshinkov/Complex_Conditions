import java.util.Scanner;

public class Zad11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projType = scanner.nextLine().toLowerCase();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        int seats = row * col;
        double tickPrice, result;

        switch (projType) {
            case "premiere":
                tickPrice = 12.00;
                result = tickPrice * seats;
                System.out.printf("%.2f leva\n", result);
                break;
            case "normal":
                tickPrice = 7.50;
                result = tickPrice * seats;
                System.out.printf("%.2f leva\n", result);
                break;
            case "discount":
                tickPrice = 5.00;
                result = tickPrice * seats;
                System.out.printf("%.2f leva\n", result);
                System.out.println("Nasko");
                break;
            default:
                break;
        }
    }
}
