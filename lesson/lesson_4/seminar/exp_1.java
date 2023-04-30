package lesson.lesson_4.seminar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exp_1 {

    /* */
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long timeEnd = System.currentTimeMillis();
        long timeStart_1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            ll.add(i);                  /*в случае с добавлением в начало работает намного быстрее */
        }
        long timeEnd_1 = System.currentTimeMillis();
        System.out.println(timeEnd-timeStart);
        System.out.println(timeEnd_1-timeStart_1);
        // System.out.println(list);
        // long[] arr = new long[Integer.MAX_VALUE];           /*превышения выделенной памяти */


    }
    
}
