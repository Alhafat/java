package lesson.lesson_6.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class task_1 {

    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или
     * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
     * фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
     * необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно также в Map.
     * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
     * условиям.
     * 
     * Работу сдать как обычно ссылкой на гит репозиторий
     * 
     * P.S. Частые ошибки смотри в конце семинара
     */
    public static void main(String[] args) {
        notebook lap_1 = new notebook("A5", 1236, "Xiaomi");
        lap_1.setColor("black");
        lap_1.setHDD(700);
        lap_1.setOS("Windows");
        lap_1.setRAM(8);

        notebook lap_2 = new notebook("ABC30", 6467, "Acer");
        lap_2.setColor("white");
        lap_2.setHDD(1000);
        lap_2.setOS("Windows");
        lap_2.setRAM(8);

        notebook lap_3 = new notebook("AB97", 67201, "Acer");
        lap_3.setColor("rose");
        lap_3.setHDD(900);
        lap_3.setOS("Windows");
        lap_3.setRAM(16);

        notebook lap_4 = new notebook("OMAN11", 1111, "hp");
        lap_4.setColor("black");
        lap_4.setHDD(700);
        lap_4.setOS("Linux");
        lap_4.setRAM(8);

        notebook lap_5 = new notebook("MAC101", 8438483, "Apple");
        lap_5.setColor("silver");
        lap_5.setHDD(1000);
        lap_5.setOS("macOS");
        lap_5.setRAM(8);

        HashSet<notebook> notebook = new HashSet<>(Arrays.asList(lap_1, lap_2, lap_3, lap_4, lap_5));
        HashSet<notebook> res = new HashSet<>();

        System.out.print(
                "Введите порядковый номер соответствующий необходимому критерию поиска:" +
                        "\n 1 - ОЗУ" +
                        "\n 2 - Объем ЖД" +
                        "\n 3 - Операционная система" +
                        "\n 4 - цвет" +
                        "\n или 5, чтобы осуществить поиск\n");
        Scanner read_condition = new Scanner(System.in, "UTF-8");
        Integer condition = read_condition.nextInt();
        read_condition.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (condition != 5) {
            if (condition == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = read_condition.nextInt();
                read_condition.nextLine();
                filters.put("RAM", temp);
            }
            if (condition == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = read_condition.nextInt();
                read_condition.nextLine();
                filters.put("HDD", temp);
            }
            if (condition == 3) {
                System.out.println("Введите ОС");
                String temp = read_condition.nextLine();
                filters.put("OS", temp);
            }
            if (condition == 4) {
                System.out.println("Введите цвет");
                String temp = read_condition.nextLine();
                filters.put("color", temp);
            }
            System.out.print(
                    "Введите порядковый номер соответствующий необходимому критерию поиска:" +
                            "\n 1 - ОЗУ" +
                            "\n 2 - Объем ЖД" +
                            "\n 3 - Операционная система" +
                            "\n 4 - цвет" +
                            "\n или 5, чтобы осуществить поиск\n");
            condition = read_condition.nextInt();
            read_condition.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = notebook.iterator();
                while (it.hasNext()) {
                    notebook lap = (notebook) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = notebook.iterator();
                while (it.hasNext()) {
                    notebook lap = (notebook) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = notebook.iterator();
                while (it.hasNext()) {
                    notebook lap = (notebook) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = notebook.iterator();
                while (it.hasNext()) {
                    notebook lap = (notebook) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            notebook lap = (notebook) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
    }
}
