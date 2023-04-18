package lesson.lesson_2.seminar;

public class exp_3 {
    /*
     * Напишите метод, который сжимает строку.
     * Пример: вход aaaabbbcdd.
     * Результат: a4b3cd2
     */
    public static void main(String s) {
        StringBuilder sb = new StringBuilder(null);
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                sb.append(arr[i - 1]);
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }
        sb.append(arr[arr.length - 1]);
        if (count > 1) {
            sb.append(count);
        }
        System.out.println(sb.toString());
    }
}
