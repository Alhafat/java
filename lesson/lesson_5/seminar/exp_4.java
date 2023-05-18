package lesson.lesson_5.seminar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class exp_4 {

    /*
     * Взять набор строк, например, Мороз и солнце день чудесный Еще ты дремлешь
     * друг
     * прелестный Пора красавица проснись.
     * Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
     * Строки с одинаковой длиной не должны “потеряться”.
     */
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        ex_3(line);
    }

    public static void ex_3(String line) {
        line = line.replace("\n", " ");
        line = line.replace(".", "");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder()); //обратная сортировка изз-а компаратора
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
