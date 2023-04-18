package lesson.homework;

import java.util.Scanner;

public class task_1 {
    /*
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
     * чисел от 1 до n)
     */
    public static void main(String[] aString) {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        Integer number = isScanner.nextInt();
        System.out.printf("Получено значение натурального числа %d\n", number);
        System.out.printf("Факториал числа %d равен %d \n", number, get_number(number));
        System.out.printf("Сумма целых натуральных чисел до %d включительно равны %d ", number,
                get_sum_numbers(number));
        isScanner.close();

    }

    public static Integer get_number(Integer value) {
        Integer result = 1;
        for (Integer i = 1; i < value + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static int get_sum_numbers(Integer value) {
        Integer result = 0;
        for (Integer i = 0; i < value + 1; i++) {
            result += i;
        }
        return result;
    }
}