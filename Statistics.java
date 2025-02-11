import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumbers = 5;
        int[] numbers = new int[userNumbers];

        System.out.println("Inserisci " + userNumbers + " numeri:");
        for (int i = 0; i < userNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double media = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Media: " + media);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
