package lesson.lesson_2.seminar;

import java.io.FileWriter;

public class exp_7 {

    public static void main(String[] aStrings) {
        String text = "Test";
        int n = 5;
        SaveFile(RepeatString(text, n));
    }
    static void SaveFile(String s) {
        String path = "test.txt";
        try (FileWriter fw = new FileWriter(path, true);){
            fw.write(s); // Подготовка к записи в файл
            fw.write('\n');
            fw.flush(); // Запись в файл            
        } catch (Exception e) {
            e.printStackTrace(); //ловим все ошибки
        } 
    }
    static String RepeatString (String s, int n) {
        return s.repeat(n);
    }    
}
