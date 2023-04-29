package lesson.lesson_3.seminar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class exp_4 {

    /*
     * Создать список типа ArrayList
     * Поместить в него как строки, так и целые числа.
     * Пройти по списку, найти и удалить целые числа.
     */

    public static void main(String[] args) {
        List list = new ArrayList(0);
        list.add(123);
        list.add("qwerty");
        list.add(234);
        list.add("qwerty");
        list.add("qwert");
        list.add(234);
        list.add(234);
        System.out.println(list);
        // java.util.Iterator iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     Object o = iterator.next();
        //     if (o instanceof Integer) {
        //         iterator.remove();
        //     }
        // }
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                    list.remove(list.get(i));
                    i--;
                }
        }
        list.removeIf(o -> o instanceof Integer);   /*лямбда */
        System.out.println(list);
    }
}
