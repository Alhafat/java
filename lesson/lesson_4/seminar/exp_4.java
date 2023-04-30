package lesson.lesson_4.seminar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class exp_4 {

    /*1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.*/
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
