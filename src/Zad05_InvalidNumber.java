import java.util.Scanner;
public class Zad05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean invalidNum = 100 <= number && number <= 200 || number == 0;

        if (!invalidNum) {
            System.out.println("invalid");
        }
    }
}
