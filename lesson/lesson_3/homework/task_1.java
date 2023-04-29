package lesson.lesson_3.homework;

import java.util.ArrayList;
import java.util.List;

public class task_1 {

    /*Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
    public static void main(String[] args) {
        List<Integer> list = del_numbers(del_numbers(get_list(10,1,10)));
        System.out.println(list);
    }
    
    public static List<Integer> get_list(Integer max, Integer min, Integer size) {
        List<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> del_numbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) {
                list.remove(i);
            }
        }
        return list;
    }
}
