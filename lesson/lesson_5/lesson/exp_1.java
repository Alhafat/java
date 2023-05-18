package lesson.lesson_5.lesson;

import java.util.HashMap;
import java.util.Map;

public class exp_1 {
    public static void main(String[] args) {
        /*HashMap*/
        // Integer a = 123;
        // System.out.println(a.hashCode());
        // System.out.println("b".hashCode()); // номер символа???
        Map<Integer,String> db = new HashMap<>();
        db.putIfAbsent(1, "Kate"); // если есть ключ не добавляет проверяет с ам
        db.put(2, "первая строка");
        db.put(null, "!null");
        // System.out.println(db);
        // System.out.println(db.containsValue("Kate")); // проверяет есть ли такое значение
        // System.out.println(db.containsKey(null)); // проверяет есть ли такой ключ
        // System.out.println(db.keySet()); // выводит все ключи
        // System.out.println(db.values()); // выводит все значения
        for (var item : db.entrySet()) {
            System.out.printf("[%d,%s]\n", item.getKey(),item.getValue());//печатает ключ+значение, можно отдельно и то и то    
        }
        // Map<Integer,String> av = new HashMap<>(9,1.0f); // первая цифра количество элементов, вторая заполненность в процентах 1,0 - 100% после которой будет увеличен
        
        /*TreeMap*/
        /*упорядочен по ключам */
        
    }
}
