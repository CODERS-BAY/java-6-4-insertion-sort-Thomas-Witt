import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {

        //int arrayLength = 8;
        int counter = 1;
        int[] numbers = {2, 15, 61, 32, -12, 6, 115, 55};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i + 1] && numbers[j] < numbers[counter]) {
                    counter = j;
                }
                if (numbers[i] > numbers[counter]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[counter];
                    numbers[counter] = temp;
                }
            }
        }
        System.out.println("The sorted array:");
        System.out.println(Arrays.toString(numbers));

     /*  The old code from my first visit to codersbay in January.

      int[] numbers = {33, 12, 5, -4, 8, -12, 187};
        System.out.println(Arrays.toString(numbers));
        int startOfUnsorted = 0;

        while(startOfUnsorted < numbers.length) {
            // find local minimum
            int myMinimumIndex = startOfUnsorted;
            int myMinimum = numbers[myMinimumIndex];
            for (int i = startOfUnsorted; i < numbers.length; i++) {
                if (numbers[i] < myMinimum) {
                    myMinimum = numbers[i];
                    myMinimumIndex = i;
                }
            }

            // switch myMinumIndex with startOfUnsorted
            int oldFirst = numbers[startOfUnsorted];
            int newFirst = numbers[myMinimumIndex];
            numbers[myMinimumIndex] = oldFirst;
            numbers[startOfUnsorted] = newFirst;
            System.out.println(Arrays.toString(numbers));

            startOfUnsorted++;
        } */
    }
}
