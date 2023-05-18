package lesson.lesson_5.seminar;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * exp_1
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
 * организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */
public class exp_1 {

    public static void main(String[] args) {
        HashMap<String, String> passport = new HashMap<String, String>();
        passport.putIfAbsent("123456", "Иванов");
        passport.putIfAbsent("321456", "Васильев");
        passport.putIfAbsent("234561", "Петрова");
        passport.putIfAbsent("234432", "Иванов");
        passport.putIfAbsent("654321", "Петрова");
        passport.putIfAbsent("345678", "Иванов");
        for (Entry<String, String> item : passport.entrySet()) {
            if (item.getValue() == "Иванов") {
                // System.out.printf("[%s,%s]\n", item.getKey(),item.getValue());
                System.out.printf("[%s]\n", item.getKey());
            }
        }
    }
}