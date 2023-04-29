package lesson.lesson_3.seminar;

import java.util.ArrayList;
import java.util.List;

public class exp_1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        int a = 5;
        test(list, a);
        System.out.println(list);
        System.out.println(a);
    }

    public static void test(List<Integer> list, int a) {
        list.add(7);                /*ссылочный тип у списка будет изменен исодный */
        a++;
    }
}
