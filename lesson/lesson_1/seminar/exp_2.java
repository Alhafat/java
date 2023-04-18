package lesson.lesson_1.seminar;

import java.time.LocalTime;
import java.util.Scanner;

public class exp_2 {
    public static void main(String[] args) {
        /*
              * В консоли запросить имя пользователя. В зависимости от текущего времени,
              * вывести приветствие вида
              * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
              * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
              * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
              * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
              */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Получено значение имени %s\n", name);
        LocalTime time = LocalTime.now();
        // LocalTime time2=LocalTime.of(11, 55, 0); // для точное время
        int hour = time.getHour();
        // int hour = time2.getHour();
        // if (hour >= 5 && time2.isBefore(time2)){} // для точного времени
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
        iScanner.close();
    }
}
