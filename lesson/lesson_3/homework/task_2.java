package lesson.lesson_3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class task_2 {

    /*
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
     * среднее арифметическое из этого списка. Collections.max()
     */

    public static void main(String[] args) {
        List<Integer> list = get_list(10, 1, 10);
        System.out.printf("Максимальное значение списка %d\n", Collections.max(list));
        System.out.printf("Минимальное значение списка %d\n", Collections.min(list));
        get_arifmetic_mean(list);
    }

    public static List<Integer> get_list(Integer max, Integer min, Integer size) {
        List<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println(list);
        return list;
    }

    public static void get_arifmetic_mean(List<Integer> list) {
        Double summ = 0.0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }
        Double ar_mean = (summ / list.size());
        System.out.printf("Среднее арифметическое %.2f", ar_mean);
    }
}
