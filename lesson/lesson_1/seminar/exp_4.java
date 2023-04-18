package lesson.lesson_1.seminar;

import java.util.Arrays;

/* Дан массив nums = [3,2,5,3] и число val = 3. 
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) 
элементов массива должны быть отличны от заданного, 
а остальные - равны ему.*/
public class exp_4 {
    public static void main(String[] args) {
        int val = 3;
        int[] arr = new int[] { 3, 2, 5, 3 };
        int[] arr_new = get_new_arr(arr, val);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr_new));
    }

    static public int[] get_new_arr(int[] temp, int value) {
        int[] result = new int[temp.length];
        Arrays.fill(result, 3);
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (temp[i] != value) {
                result[j++] = temp[i];
            }
        }
        return result;
    }
}

// for (int i = 0, j =0; i < size; i++) {
// if (temp[i] != condition) {
// result[j++] = temp[i];