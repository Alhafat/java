package lesson.lesson_6.seminar;

import java.util.HashSet;
import java.util.Set;

public class exp_4 {
    /*
     * 1. Создайте множество, в котором будут храниться экземпляры класса Cat -
     * HashSet<Cat>. Поместите в него некоторое количество объектов.
     * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их
     * во множество. Убедитесь, что все они сохранились во множество.
     * 3. Создайте метод public boolean equals(Object o)
     * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То
     * есть, метод должен возвращать true, только если значения во всех полях
     * сравниваемых объектов равны.
     * 4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты
     * удалились
     */

    public static void main(String[] args) {
        cat cat_1 = new cat("Пуся", "ж", 3, "Вася");
        cat cat_2 = new cat("Дуся", "ж", 5, "Вася");
        cat cat_3 = new cat("Дуся", "ж", 5, "Вася");
        cat cat_4 = new cat("Блохуся", "ж", 2, "Петя");
        // cat cat_3 = cat_2;
        // System.out.println(cat_1);
        // System.out.println(cat_2);
        // System.out.println(cat_3);

        Set<cat> cats = new HashSet<>();
        cats.add(cat_1);
        cats.add(cat_2);
        cats.add(cat_3);
        cats.add(cat_4);
        // System.out.println(cats);
        for (cat cat : cats) {
            System.out.println(cat);
        }
        for (cat cat : cats) {
            if (cat.getAge()==5) {
                System.out.println(cat);
            }
        }
    }
}
