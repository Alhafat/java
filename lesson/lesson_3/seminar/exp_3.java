package lesson.lesson_3.seminar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exp_3 {

    /*
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */

    public static void main(String[] args) {
        List<Integer> list = get_list(10, 1, 10);
        System.out.println(list);
        sort_list(list);
    }

    public static List<Integer> get_list(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    public static void sort_list(List<Integer> list) {
        // list.sort(Comparator.reverseOrder());
        // System.out.println(list);
        Collections.sort(list);    /*сортировка через коллекции по возрастанию*/
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());      /*сортировка на убывание */
        System.out.println(list);
    }
}
