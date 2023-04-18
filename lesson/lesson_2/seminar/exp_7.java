package lesson.lesson_2.seminar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class exp_7 {

    public static void main(String[] aStrings) {
        String text = "Test";
        int n = 5;
        SaveFile(RepeatString(text, n));
    }

    static void SaveFile(String s) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("txt");
        } catch (IOException e) {
            e.printStackTrace(); //ловим все ошибки
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "n/n/n/test.txt";
       try (FileWriter fw = new FileWriter(path, true);){
            fw.write(s); // Подготовка к записи в файл
            fw.write('\n');
            fw.flush(); // Запись в файл            
        } catch (Exception e) {
            e.printStackTrace(); //ловим все ошибки
            logger.log(Level.WARNING, "Что-то пошло не так");
        } 
        System.out.println("Тест");
        fileHandler.close();
    }

    static String RepeatString(String s, int n) {
        return s.repeat(n);
    }
}
