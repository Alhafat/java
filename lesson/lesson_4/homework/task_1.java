package lesson.lesson_4.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class task_1 {
    /*
     * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
     * вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        list = reverce_list(list);
        System.out.println(list);
    }

    public static LinkedList<Integer> reverce_list(LinkedList<Integer> list) {
        LinkedList<Integer> new_list = new LinkedList<>();
        for (Integer item : list) {
            new_list.addFirst(item);
        }
        // System.out.println(new_list);
        return new_list;
    }
}
