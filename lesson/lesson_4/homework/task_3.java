package lesson.lesson_4.homework;

import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class task_3 {

    /*
     * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
     * Используйте итератор
     */

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        get_sum_numbers(list);
    }

    public static void get_sum_numbers(LinkedList<Integer> list) {
        Integer summ = 0;
        for (Integer item : list) {
            summ+=item;
        }
        System.out.println(summ);
        // System.out.println(list);
    }
}
