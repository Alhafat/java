package lesson.lesson_3.seminar;

import java.util.ArrayList;
import java.util.List;

public class exp_5 {

    /*Каталог товаров книжного магазина сохранен в виде двумерного 
    списка List<ArrayList<String>> так, что на 0й позиции каждого 
    внутреннего списка содержится название жанра, а на остальных 
    позициях - названия книг. Напишите метод для заполнения данной структуры. */
    
    public static void main(String[] args) {
        List<List<String>> shop_book = new ArrayList<>();
        add_book("роман", "война и мир", shop_book);
        System.out.println(shop_book);
        add_book("фантатика", "дюна", shop_book);
        System.out.println(shop_book);
        add_book("фантатика", "дюна2", shop_book);
        System.out.println(shop_book);
    }

    public static void add_book(String type_book, String name, List<List<String>> shop_book) {
        for (int i = 0; i < shop_book.size(); i++) {
            if (shop_book.get(i).get(0).equals(type_book)){
                shop_book.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(type_book);
        list.add(name);
        shop_book.add(list);
    }
}
