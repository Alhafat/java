package lesson.lesson_1.homework;

import java.util.Scanner;

public class task_3 {
    /*
     * Реализовать простой калькулятор (введите первое число, введите второе число,
     * введите требуемую операцию, ответ)
     */
    public static void main(String[] aStrings) {

        Scanner isScanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        Integer number_1 = isScanner.nextInt();
        System.out.printf("Получено значение натурального числа %d\n", number_1);
        
        System.out.println("Введите второе число: ");
        Integer number_2 = isScanner.nextInt();
        System.out.printf("Получено значение натурального числа %d\n", number_1);

        
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите оператор: ");
        char operator = iScanner.next().trim().charAt(0);
        iScanner.close();
        isScanner.close();

        calculate(number_1, number_2, operator);
    }

    public static void calculate(Integer val_1, Integer Val_2, char operator) {
        if (operator == '+') {
            System.out.printf("%d + %d = %d\n", val_1, Val_2, val_1 + Val_2);
        }
        if (operator == '-') {
            System.out.printf("%d - %d = %d\n", val_1, Val_2, val_1 - Val_2);
        }
        if (operator == '*') {
            System.out.printf("%d * %d = %d\n", val_1, Val_2, val_1 * Val_2);
        }
        if (operator == '/') {
            System.out.printf("%d / %d = %d\n", val_1, Val_2, val_1 / Val_2);
        }
    }
}
