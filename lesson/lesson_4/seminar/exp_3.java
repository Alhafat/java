package lesson.lesson_4.seminar;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class exp_3 {

    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная
     * была первой в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        while (repeat) {
            System.out.printf("%s\n>>> ", "Введите строку вида text~num:");
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
                    while (listIterator.hasPrevious()) {
                        System.out.printf("%s", listIterator.previous());
                    }
                    break;
                case "revert":
                    linkedList.removeLast(); /* удаляет последний */
                    System.out.println(linkedList);
                    break;
                case "exit":
                    repeat = false;
                    break;
                default:
                    linkedList.add(line);
                    break;
            }
        }
    }
}