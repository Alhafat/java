package lesson.lesson_3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task_3 {

    /*
     * Заполнить список названиями планет Солнечной системы в произвольном порядке с
     * повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     */

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн",
                "Уран", "Нептун", "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"));
        get_planets_quantity(planets);
    }

    public static void get_planets_quantity(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer count=0;
            String temp=list.get(i);
            for (String planet : list) {
                if (temp.equals(planet)) {
                   count++; 
                }
            }    
            System.out.printf("Планета %s встречается в списке %d раз.\n", list.get(i), count);
            list.removeAll(Arrays.asList(list.get(i)));
            i--;        
        } 
    }

}
