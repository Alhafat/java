package lesson.lesson_4.homework;

import java.util.Arrays;

public class task__4 {

    /**
     * реализовать вторую задачу через собственный класс используя в основе массив
     */

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };
        System.out.printf("Исходный массив: %s\n", Arrays.toString(arr));
        arr = get_reverse_arr(arr);
        System.out.printf("Перевернутый массив: %s\n", Arrays.toString(arr));
    }

    private static Integer[] get_reverse_arr(Integer[] arr) {
        Integer[] new_arr = new Integer[arr.length];
        for (int i = arr.length - 1; i > -1; i--) {
            new_arr[new_arr.length - i - 1] = arr[i];
            // System.out.println(arr[i]);
        }
        // System.out.println(Arrays.toString(new_arr));
        return new_arr;
    }
}
