package lesson.lesson_2.homework;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class task_2 {
    /*
     * Реализуйте алгоритм сортировки пузырьком числового массива, результат после
     * каждой итерации запишите в лог-файл.
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = get_random_arr();
        System.out.println("Получен массив: \n" + Arrays.toString(arr));
        sort_arr(arr);
    }

    public static int[] get_random_arr() {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;

    }

    public static void sort_arr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempVar = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempVar;
                    write_file(arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void write_file(int[] sort_arr) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("sort_arr.txt", true), "UTF-8"))) {
            writer.write("--------------------------------------");
            writer.newLine();
            int len = sort_arr.length;
            for (int i = 0; i < len; i++) {
                writer.write(sort_arr[i] + "\t" + "");
            }
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
