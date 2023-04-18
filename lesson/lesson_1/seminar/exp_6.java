package lesson.lesson_1.seminar;


/*Реализовать функцию возведения числа а в степень b. 
a, b из Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1 */
public class exp_6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(get_pow(a, b));
    }

    public static double get_pow(int num_1, int num_2) {
        if (num_2 == 0) {
            return 1;
        } else if (num_2 == 1) {
            return num_1;
        } else if (num_2 < 0) {
            double f = num_1;
            for (int i = 0; i >= num_2; i--) {
                f = f / num_1;
            }
            return f;
        } else {
            for (int i = 1; i < num_2; i++) {
                num_1 = num_1 * num_1;
            }
            return num_1;
        }
    }
}

