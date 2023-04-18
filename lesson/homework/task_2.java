package lesson.homework;

public class task_2 {
    /*
     * Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и
     * на себя без остатка)
     */
    public static void main(String[] aStrings) {
        get_numbers();

    }

    public static void get_numbers() {
        // System.out.printf("Число 2 является простым\n");
        for (int i = 2; i < 10; i++) {
            Boolean flag = true;
            for (int j = 2; j <= i / 2 + 1; j++) {
                if (i % j == 0 && i!=2) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("Число %d является простым\n", i);
            }
        }
    }
}
