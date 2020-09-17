import java.util.Arrays;

public class RealInsertionSort {
    public static void main(String[] args) {

        int[] numbers = {2, 15, 61, 32, -12, 6, 115, 55};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }
        }
        System.out.println("The sortet array:");
        System.out.println(Arrays.toString(numbers));
    }
}
