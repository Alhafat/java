package lesson.lesson_2.seminar;

public class exp_4 {
    /*Напишите метод, который принимает на вход строку (String) 
    и определяет является ли строка палиндромом 
    (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево. */
    public static void main(String[] args) {
        String s = "aaaabbbaaaa";
        System.out.println(ex0(s));
    }
    
    public static boolean ex0(String value) {
        value = value.replace(" ", "");
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        System.out.println(sb);
        return sb.toString().equalsIgnoreCase(value);
    }
}
