public class Statistics {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double media = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Media: " + media);
    }
}
