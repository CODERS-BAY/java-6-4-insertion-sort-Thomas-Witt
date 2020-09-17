public class InsertionSort {
    public static void main(String[] args) {

    }




/*
    public static void main(String[] args) {
        int[] list = new int[0];
        Scanner scanner = new Scanner(System.in);
        list = giveMeAllYourNumbers(list, scanner);
        System.out.println("Dein Input:" + Arrays.toString(list));
        System.out.println(" Sortiert: " + Arrays.toString(itSorts(list)));
    }

    private static int[] giveMeAllYourNumbers(int[] list, Scanner scanner) {
        System.out.println("Bitte gib die zu sortierenden Zahlen ein:");
        int input;
        while (!scanner.hasNext("q") && !scanner.hasNext("Q")) {
            input = scanner.nextInt();
            int[] temp = new int[list.length + 1];
            System.arraycopy(list, 0, temp, 0, list.length);
            temp[list.length] = input;
            list = temp;
        }
        return list;
    }

    private static int[] itSorts(int[] list) {
        for (int n = 0; n < (list.length - 1); n++) {
            if (list[n + 1] < list[n]) {
                for (int i = 0; i < (n + 1); i++) {
                    if (list[n + 1] < list[i]) {
                        int[] templist = new int[list.length];
                        System.arraycopy(list, 0, templist, 0, list.length);
                        templist[i] = list[n + 1];
                        for (int j = (i + 1); j <= (n + 1); j++) {
                            templist[j] = list[j - 1];
                        }
                        list = templist;
                    }
                }
            }
        }
        return list;
    }*/
}
