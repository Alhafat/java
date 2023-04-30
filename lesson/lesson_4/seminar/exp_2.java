package lesson.lesson_4.seminar;

import java.util.LinkedList;
import java.util.Scanner;

public class exp_2 {

    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка.
     */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            if (num>list.size()){
                System.out.println("неверный индекс");
                continue;
            }
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;

                case "exit":
                    System.out.println("До скорой встречи!");
                    work = false;
                    break;

                default:
                    list.add(num, text);
                    break;
            }
        }
        System.out.println();
    }

}
