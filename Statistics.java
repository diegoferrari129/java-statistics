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
                System.out.print("Inserisci il numero " + (i + 1) + " di " + userNumbers + ": ");
                String input = scanner.nextLine().trim();

                try {
                    numbers[i] = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Errore: Devi inserire un numero intero positivo. Inserisci un numero alla volta.");
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
