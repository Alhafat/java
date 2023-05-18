package lesson.lesson_5.homework;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;

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
        name(list);
        // System.out.println(list);

    }

    public static void name(Map<String, String> list) {
        Scanner command = new Scanner(System.in);
        System.out.println("Какую операцию желаете провести: ");
        System.out.println("1 - Чтение справочника.");
        System.out.println("2 - Поиск контакта.");
        System.out.println("3 - Изменение контакта.");
        System.out.println("4 - Добавление контакта.");
        System.out.println("5 - Удаление контакта.");

        Integer answer = command.nextInt();
        if (answer == 1) {
            print_guide(list);
        }
        if (answer == 2) {
            find_person(list);
        }
        if (answer == 3) {
            list = change_person(list);
        }
        if (answer == 4) {
            list = add_person(list);
            System.out.println(list);
        }
        if (answer == 5) {

        }
        command.close();
    }

    public static void print_guide(Map list) {
        System.out.println(list);
    }

    public static void find_person(Map list) {
        Scanner isScanner = new Scanner(new InputStreamReader(System.in, "UTF-8"));
        System.out.println("Введите имя:");
        String value_name = isScanner.nextLine();
        System.out.println(value_name);
        System.out.println(list.containsValue(value_name));
        if (list.containsValue(value_name) == false) {
            System.out.println("Такого контакта нет. Конец программы.");
            isScanner.close();
        } else {
            for (var item : list.entrySet()) {
                if (item.equals(value_name)) {
                    System.out.printf("[%s,%s]\n", item.getKey(), item.getValue());
                }
            }
            isScanner.close();
        }
    }

    public static Map change_person(Map list) {
        find_person(list);
        Scanner isScanner = new Scanner(new InputStreamReader(System.in, "UTF-8"));
        System.out.println("Введите имя:");
        String value_name = isScanner.nextLine();
        System.out.println(value_name);
        // System.out.println(list.containsValue(value_name));
        if (list.containsValue(value_name) == false) {
            System.out.println("Такого контакта нет. Конец программы.");
            isScanner.close();
        } else {
            for (var item : list.entrySet()) {
                if (item.equals(value_name)) {
                    System.out.printf("[%s,%s]\n", item.getKey(), item.getValue());
                }
            }
            isScanner.close();
        }
        return list;
    }

    public static Map add_person(Map list) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        String number = isScanner.nextLine();
        Scanner value_name = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = value_name.nextLine().toUpperCase();
        list.put(number, name);
        // System.out.println("list");
        isScanner.close();
        value_name.close();
        return list;
    }
}
