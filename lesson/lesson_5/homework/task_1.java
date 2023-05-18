package lesson.lesson_5.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class task_1 {

    /*
     * Реализуйте структуру телефонной книги с помощью HashMap,
     * учитывая, что 1 человек может иметь несколько телефонов.
     * 123456 Иванов
     * 321456 Васильев
     * 234561 Петрова
     * 234432 Иванов
     * 654321 Петрова
     * 345678 Иванов
     */
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<>();
        list.put("123456", "ИВАНОВ");
        list.put("321456", "ВАСИЛЬЕВ");
        list.put("234561", "ПЕТРОВА");
        list.put("234432", "ИВАНОВ");
        list.put("654321", "ПЕТРОВА");
        list.put("345678", "ИВАНОВ");
        list.put("345678", "PETROV");
        name(list);
        // System.out.println(list);

    }

    public static void name(Map<String, String> list) {
        Scanner command = new Scanner(System.in);
        System.out.println("Какую операцию желаете провести: ");
        System.out.println("1 - Чтение справочника.");
        System.out.println("2 - Поиск контакта.");
        System.out.println("3 - Добавление контакта.");
        System.out.println("4 - Удаление контакта.");

        Integer answer = command.nextInt();
        if (answer == 1) {
            print_guide(list);
        }
        if (answer == 2) {
            find_person(list);
        }
        if (answer == 3) {
            list = add_person(list);
            System.out.println(list);
        }
        if (answer == 4) {
            list = delete_person(list);
            System.out.println(list);
        }
        command.close();
    }

    public static void print_guide(Map list) {
        System.out.println(list);
    }

    public static void find_person(Map list) {
        Scanner isScanner = new Scanner(System.in, "UTF-8");
        System.out.println("Введите имя:");
        String value_name = isScanner.nextLine().toUpperCase();
        // System.out.println(value_name);
        // System.out.println(list.containsValue(value_name));
        if (list.containsValue(value_name) == false) {
            System.out.println("Такого контакта нет. Конец программы.");
            isScanner.close();
        } else {
            List<String> listOfKeys = getAllKeysForValue(list, value_name);
            for (String item : listOfKeys) {
                System.out.printf("[%s,%s]\n", list.get(item), item);
            }
            isScanner.close();
        }
    }

    public static Map add_person(Map list) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        String number = isScanner.nextLine();
        Scanner value_name = new Scanner(System.in, encoding);
        System.out.println("Введите имя:");
        String name = value_name.nextLine().toUpperCase();
        System.out.println(name);
        list.put(number, name);
        // System.out.println("list");
        isScanner.close();
        value_name.close();
        return list;
    }

    public static Map delete_person(Map list) {
        Scanner value_name = new Scanner(System.in);
        System.out.println("Введите имя удаляемого контакта:");
        String name = value_name.nextLine().toUpperCase();
        System.out.println(name);
        if (list.containsValue(name) == false) {
            System.out.println("Такого контакта нет. Конец программы.");
            value_name.close();
            return list;
        } else {
            List<String> listOfKeys = getAllKeysForValue(list, name);
            for (String item : listOfKeys) {
                list.remove(item);
            }
            return list;
        }
    }

    static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfWords, V value) {
        List<K> listOfKeys = null;

        // проверяем есть ли такое значение в мапе
        if (mapOfWords.containsValue(value)) {
            // создаем список
            listOfKeys = new ArrayList<>();

            // записываем каждый ключ по значению.
            for (Map.Entry<K, V> entry : mapOfWords.entrySet()) {
                // проверяем совпадает ли значение с заданным
                if (entry.getValue().equals(value)) {
                    // добавляем ключ
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        return listOfKeys;
    }
}
