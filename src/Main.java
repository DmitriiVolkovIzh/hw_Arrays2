import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomArray()));

        // Задание 1
        System.out.println();
        System.out.println("Задание 1");
        int sumSpending = 0;
        for (int i = 0; i < array.length; i++) {
            sumSpending = sumSpending + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumSpending + " рублей.");


        // Задание 2
        System.out.println("Задание 2");

        int maxSpending = -1;
        for (final int current : array) {
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        int minSpending = 201000;
        for (final int current : array) {
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за месяц сотавила " + minSpending + " рублей. Максимальная сумма трат за месяц сотавила " + maxSpending + " рублей");

        // Задание 3
        System.out.println("Задание 3");
        double averangeSpending = sumSpending / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averangeSpending + " рублей");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


}