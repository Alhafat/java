package lesson.lesson_1.lection;

// import java.util.Scanner;

/**
 * exp_1
 */
public class exp_1 {

    // static public void say_hi() {
    // System.out.println("hi");
    // }

    // static public int sum() {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.println("Введите значение a: ");
    // int a = iScanner.nextInt();
    // System.out.printf("Получено значение a = %d\n", a);
    // System.out.println("Введите значение b: ");
    // int b = iScanner.nextInt();
    // System.out.printf("Получено значение b = %d\n", b);
    // iScanner.close();
    // return a + b;
    // }

    public static void main(String[] args) {
        // System.out.println("by world");
        // System.out.println("hi world");
        // String s = "now";
        // s += "now";
        // System.out.println(s);
        // Short age = 10;
        // int salary = 12345;
        // System.out.println(age);
        // System.out.println(salary);
        // Float e = 2.7f; // для fkoat надо ставить f
        // Double pi = 3.1415; // одно и то же
        // Double pi1 = 3.1415D; // одно и то же
        // System.out.println(e);
        // System.out.println(pi);
        // System.out.println(pi1);
        // char ct = '{'; // одно и то же
        // char ch=43; //одно и то же
        // System.out.println(ch);
        // // System.out.println(ch);
        // String a = null;
        // System.out.println(a);
        // int v = 13;
        // double d = v;
        // System.out.println(d);
        // boolean f = true && false;
        // System.out.println(f);
        // boolean q = true ^ true; // спросить семинар про логические операции и
        // побитовые
        // System.out.println(q);
        // var i = 123_456_413;
        // System.out.println(i);
        // // System.out.println(getType(i)); //не работает
        // System.out.println(Integer.MAX_VALUE);
        // String w = "qwerty";
        // System.out.println(w.length()); // длинна строки
        // System.out.println(w.charAt(1)); // обращение по индексу элемента тоже с 0
        // int r = 123;
        // System.out.println(r);
        // r++; // оператор инкремента постфиксный
        // System.out.println(r);
        // System.out.println(r++); // важно!!! постфиксный инкремент
        // System.out.println(++r); // префиксный инкремент
        // System.out.println(r); // важно!!!
        // r = r-- - --r;
        // System.out.println(r);
        // Boolean t = 123 != 243;
        // System.out.println(t);
        // int y = 18; // =10010 в двоичной системе
        // System.out.println(y >> 1); // = 1001
        // int u = 5; // 101
        // int o = 2; // 010
        // System.out.println(u | o); // 111
        // System.out.println(u & o); // 000
        // String p = "qwert";
        // boolean g = s.length() >= 5 && s.charAt(4) == '1'; //быстрый способ и
        // проверяет только одно
        // System.out.println(g);
        // int[] arr=new int[10];
        // System.out.println(arr);
        // arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        // // System.out.println(arr.length);
        // System.out.println(arr[0]); //как вывести весь массив?
        // int[] arr[] = new int[3][5];
        // for (int[] line : arr) {
        // for (int item : line) {
        // System.out.printf("%d", item);
        // }
        // System.out.println();
        // int[][]arr = new int[3][5]; //двумерный массив(массивы массивов)
        // for (int i=0; i<arr.length;i++) {
        // for (int j=0; j<arr[i].length;j++) {
        // System.out.printf("%d", arr[i][j]);
        // }
        // System.out.println();
        // }
        // byte->short->int->long->float; char->int; int->float; int->double;
        // long->double&float //возможные преобразования типов
        // int i=123; double d=i; //неявное приведение типов
        // System.out.println(i);
        // System.out.println(d);
        // int b=1;
        // System.out.println(b);
        // b=Byte.parseByte("-128"); //размер типа от -128 до 127 (0-255 байтов)
        // System.out.println(b); //явное приведение типов

        //// массив целых чисел нельзя просто так положить в массив вещественных

        //// получение данных из терминала

        // Scanner iScanner =new Scanner(System.in);
        // System.out.println("name: ");
        // String name=iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // // int x = iScanner.nextInt();
        // boolean flag = iScanner.hasNextInt(); //проверка введено ли числовое значение
        // для int
        // System.out.println(flag);
        // System.out.printf("double a: "); //ввод через хапятую вместо точки
        // double y = iScanner.nextDouble();
        // // System.out.printf("%d+%f=%f", x, y, x + y);
        // iScanner.close();

        // //форматированный вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + "+" + b + "=" + c; // конкатинация
        // String res = String.format("%d+%d=%d\n", a, b, c);
        // System.out.printf("%d+%d=%d\n", a, b, c);
        // System.out.println(res);

        //// Виды спецификаторов
        //// %d: целочисленные
        //// %x: для ввода шестнадцатеричных чисел
        //// %f: для ввода чисел с плавающей точкой
        //// %e: для вывода чисел в экспоненциальной форме, 3,1415е+01
        //// %c: для вывода одиночного символа
        //// %s: для вывода строковых значений

        //// виды спецификаторов
        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi);
        // System.out.printf("%.2f\n", pi);
        // System.out.printf("%.3f\n", pi);
        // System.out.printf("%e\n", pi);
        // System.out.printf("%.2e\n", pi);
        // System.out.printf("%.3e\n", pi);

        // lib.say_hi(); //вызов из другого файла
        // say_hi(); //вызов из функции выше(вначале)
        // System.out.printf("Сумма равна %d", sum()); //возврат из функции выше
        // int mounth = value;
        // String text = "";
        // switch (mounth) { //свитч кейс
        // case 1: System.out.println("a");
        // text = "Autumn";
        // break;

        // default: //необязательна, выполнится если в кейсы выше неподошли
        // text = "mistake";
        // break;
        // int value = 123;
        // int count = 0;
        // while (value != 0) { //while
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);
        // int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // for (int item : arr) {      
        //     item = 13;                       //локальная переменная не переписывает значение массива
        //     System.out.println(item);
        // }
        // for (int item : arr) {      
        //     System.out.println(item);
        // }
        // import java.io.FileWriter;                   //для работы с файлами
        // import java.io.IOException;                  //для работы с файлами
        
    }

}

// public class Program {
// public static void main(String[] args) {
// var i = 123;
// System.out.println(i);
// System.out.println(getType(i)); //не работает
// }
// }
// static String getType(Object o){
// return o.getClass().getSimpleName();
// }