package java.lesson.lesson_6.lesson;

import java.util.Arrays;
import java.util.HashSet;

/**
 * exp_1
 */
public class exp_1 {

    public static void main(String[] args) {
        worker w1 = new worker();
        w1.first_name = "name_1";
        w1.last_name = "name_2";
        w1.salary = 100;
        w1.id = 1000;

        worker w4 = new worker();
        w4.first_name = "name_1";
        w4.last_name = "name_2";
        w4.salary = 100;
        w4.id = 1000;

        worker w2 = new worker();
        w2.first_name = "name_1";
        w2.last_name = "name_2";
        w2.salary = 200;
        w2.id = 2000;

        worker w3 = new worker();
        w3.first_name = "name_1";
        w3.last_name = "name_2";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }
}