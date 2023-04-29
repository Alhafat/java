package lesson.lesson_3.seminar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exp_2 {

    /* чтение из ффайла в переменную*/
    
    public static void main(String[] args) {
        
    }

    static void readFile(){
        File file = new File("test.txt");
        Scanner scanner = null;
        try {
        scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
        res += scanner.nextLine() + "\n";
        }
        System.out.println(res);
        }
}
