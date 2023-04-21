package lesson.lesson_2.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class task_1 {
    /*
     * Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
     * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":
     * "Краснов","оценка":"5","предмет":"Физика"}]
     * Задача написать метод(ы), который распарсит строку и выдаст ответ вида: //+
     * Студент Иванов получил 5 по предмету Математика.
     * Студент Петрова получил 4 по предмету Информатика.
     * Студент Краснов получил 5 по предмету Физика.
     * 
     * Используйте StringBuilder для подготовки ответа
     * 
     * Исходная json строка это просто String !!! Для работы используйте методы
     * String, такие как replace, split, substring и т.д. по необходимости
     * 
     * Создать метод, который запишет результат работы в файл. Обработайте //+
     * исключения и запишите ошибки в лог файл.
     * 2. *Получить исходную json строку из файла, используя FileReader или Scanner
     * //+
     * 3. *Реализуйте алгоритм сортировки пузырьком числового массива, результат
     * после каждой итерации запишите в лог-файл.
     */

    public static void main(String[] args) {
        String str = read_file();
        String[] result = get_str_arr(str);
        get_str_val(result);
    }

    public static String read_file() {
        File file = new File("lesson/lesson_2/homework/file.txt");
        try {
            Scanner sc = new Scanner(file, StandardCharsets.UTF_8);
            String name = sc.nextLine();
            // while (sc.hasNextLine()) {
            // System.out.println(sc.nextLine());
            // }
            sc.close();
            System.out.println("Получено значение: \n" + name + "\n");
            return name;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String[] get_str_arr(String value) {
        value = value.replace(":", ",")
                .replaceAll("[^A-Za-zА-Яа-я-0-9-,]", "")
                .replace("фамилия", "Студент")
                .replace("оценка", "получил")
                .replace("предмет", "по предмету");
        String[] arr = value.split(",");
        System.out.println("Получен исходный массив: \n" + Arrays.toString(arr) + "\n");
        return arr;
    }

    public static void get_str_val(String[] arr) {
        // String text = arr[0] + " ";
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i].equals("Студент")) {
        // text = text.trim() + "."; // удаляет пробелы
        // System.out.println(text);
        // write_file(text); // дописывает в файл
        // text = arr[0] + " ";
        // } else {
        // text += arr[i] + " ";
        // }
        // if (i == arr.length - 1) {
        // System.out.println(text = text + ".");
        // write_file(text);
        // }
        String text = ".";
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i].equals("Студент")) {
                text = arr[0] + text;
                System.out.println(text + "\n");
                write_file(text); // дописывает в файл
                text = ".";
            } else {
                text = " " + arr[i] + text;
            }
        }
    }

    public static void write_file(String aString) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("/*lesson/lesson_2/homework/file.txt", true), "UTF-8"))) {
            writer.write(aString);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            appendToFile(e);
            System.out.println(e);
        }
    }

    public static void appendToFile(Exception e) {
        try {
           BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("lesson/lesson_2/homework/mistakes.txt"), "UTF-8"));
           PrintWriter pWriter = new PrintWriter(out, true);
           e.printStackTrace(pWriter);
           out.newLine();
        }
        catch (Exception ie) {
           throw new RuntimeException("Could not write Exception to file", ie);
        }
    }
}
