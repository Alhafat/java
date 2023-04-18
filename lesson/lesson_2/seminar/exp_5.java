package lesson.lesson_2.seminar;

public class exp_5 {
    /*Напишите метод, который составит строку, 
    состоящую из 100 повторений слова TEST и метод, 
    который запишет эту строку в простой текстовый файл, 
    обработайте исключения. */
    public static void main(String[] aStrings) {
        String text = "TEST";
        int n = 10;
        System.out.println(RepeatString(text, n));
    }
    static String RepeatString (String s, int n) {
        return s.repeat(n);
    }
}