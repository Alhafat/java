package lesson.lesson_6.seminar;


public class exp_3 {

    /*
     * . Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
     * приложения, которое является
     * а) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в java.
     */
    public static void main(String[] args) {
        // cat cat_1 = new cat();
        // System.out.println(cat_1.getName());
        // cat_1.setName("Пуся");
        cat cat_1 = new cat("Пуся", "ж", 3, "Вася");
        cat cat_2 = new cat("Дуся", "ж", 3, "Вася");
        System.out.println(cat_1);
        System.out.println(cat_2);
    }
}
