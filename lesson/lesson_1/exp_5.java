package lesson.lesson_1;

/*Во фразе "Добро пожаловать на курс по Java" 
переставить слова в обратном порядке. */
public class exp_5 {
    public static void main(String[] args) {
        String text="Добро пожаловать на курс по Java";
        System.out.println(get_string(text));
    }

    public static String get_string(String value) {
        String res = "";
        String[] temp = value.split(" ");
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
}

// String res = "";
//         String[] temp = text.split(" ");
//         for (int i = temp.length-1; i >= 0; i--) {
//             res += temp[i] + " ";
//         }
//         return res;
//     }