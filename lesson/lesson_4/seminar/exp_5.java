package lesson.lesson_4.seminar;

public class exp_5 {

    /*
     * Реализовать стэк с помощью массива.
     * Нужно реализовать методы:
     * size(), empty(), push(), peek(), pop().
     */

    public static void main(String[] args) {
        mystack stack = new mystack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.empty());
        System.out.println("Количчество элементов в стеке: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
