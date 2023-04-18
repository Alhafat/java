package lesson.lesson_2.seminar;

// import java.util.Scanner;

public class exp_2 {
    /*
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N,
     * которая состоит из чередующихся символов c1 и c2, начиная с c1.
     * Ответ: c1c2c1…c2 (всего N символов)
     */
    public static void main(String[] aStrings) {
        // Scanner isScanner = new Scanner(System.in);
        // System.out.println("Введите положительное четное число: ");
        // Integer str_len = isScanner.nextInt();
        // System.out.printf("Получено значение числа %d\n", str_len);
        Integer str_len = 4;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(ex0(str_len, c1,c2));
    }

    public static String ex0(int len, char value_1, char value_2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len/2; i++) {
            sb.append(value_1).append(value_2);
        }
        return sb.toString();
    }

}
