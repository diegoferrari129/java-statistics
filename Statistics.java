import java.util.Scanner;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumbers = 5;
        int[] numbers = new int[userNumbers];

        System.out.println("Inserisci " + userNumbers + " numeri:");
        for (int i = 0; i < userNumbers; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Errore: Inserisci un numero valido. Tutti i numeri devono essere interi.");
                    scanner.next();
                }
            }
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

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Media: " + media);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
