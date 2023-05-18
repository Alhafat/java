package lesson.lesson_5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task_2 {

    /*
     * Пусть дан список сотрудников:
     * Иван Иванов,
     * Светлана Петрова,
     * Кристина Белова,
     * Анна Мусина,
     * Анна Крутова,
     * Иван Юрин,
     * Петр Лыков,
     * Павел Чернов,
     * Петр Чернышов,
     * Мария Федорова,
     * Марина Светлова,
     * Мария Савина,
     * Мария Рыкова,
     * Марина Лугова,
     * Анна Владимирова,
     * Иван Мечников,
     * Петр Петин,
     * Иван Ежов.
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
            "Иван", "Иванов",
            "Светлана", "Петрова",
            "Кристина", "Белова",
            "Анна", "Мусина",
            "Анна", "Крутова",
            "Иван", "Юрин",
            "Петр", "Лыков",
            "Павел", "Чернов",
            "Петр", "Чернышов",
            "Мария", "Федорова",
            "Марина", "Светлова",
            "Мария", "Савина",
            "Мария", "Рыкова",
            "Марина", "Лугова",
            "Анна", "Владимирова",
            "Иван", "Мечников",
            "Петр", "Петин",
            "Иван", "Ежов"));

        System.out.println(list);
        get_treemap(list);

    }

    public static void get_treemap(List<String> list) {
        TreeMap<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String item : list) {
            Integer count = 0;
            for (String object : list) {
                if (item == object) {
                    count++;
                }
            }
            if (count == 1) {
                continue;
            } else if (map.containsKey(count)) {
                List<String> value = map.get(count);
                if (!value.contains(item)) {
                    value.add(item);
                }
            } else {
                List<String> value = new ArrayList<>();
                value.add(item);
                map.put(count, value);
            }
        }
        System.out.println(map);
    }
}
