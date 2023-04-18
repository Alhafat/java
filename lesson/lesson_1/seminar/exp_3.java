package lesson.lesson_1;

import java.util.Arrays;

public class exp_3 {
    /*
     * Дан массив двоичных чисел, например [1,1,0,1,1,1],
     * вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > max_len) {
                    max_len = count;
                }
                count = 0;
            }
        }
        if (count > max_len) {
            max_len = count;
        }
        System.out.println(max_len);
    }
}
