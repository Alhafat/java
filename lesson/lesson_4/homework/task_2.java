package lesson.lesson_4.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {

    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     */

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 10, 3, 4, 5));
        System.out.println(list);
        enqueue_list(list);
        Integer first_del_element = dequeue_list(list);
        Integer first_element = first_list(list);
    }

    public static void enqueue_list(LinkedList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer number = scanner.nextInt();
        System.out.printf("Получено значение натурального числа %d\n", number);
        list.addLast(number);
        System.out.printf("Значение %d добавлено в очередь.\n", number);
        System.out.println(list);
    }

    public static Integer dequeue_list(LinkedList<Integer> list) {
        System.out.printf("Удален первый элемент очереди: %d \n", list.get(0));
        // System.out.println(list);
        return list.pop();
    }

    public static Integer first_list(LinkedList<Integer> list) {
        System.out.printf("Первый элемент очереди: %d \n", list.get(0));
        return list.element();
        // System.out.println(list);
    }
}
