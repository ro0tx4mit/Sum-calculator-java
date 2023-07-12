import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of the five integers is: " + sum);

        scanner.close();
    }
}
