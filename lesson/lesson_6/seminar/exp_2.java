package lesson.lesson_6.seminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
 * цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью
 * Set вычислите процент уникальных значений в данном массиве и верните его в
 * виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее
 * количество чисел в массиве.
 */
public class exp_2 {
    public static void main(String[] args) {
        Integer[] arr = createArray(1000, 0, 24);
        System.out.println(Arrays.toString(arr));
        double unicPercent = unicPercent(arr);
        System.out.println("Процент уникальности равен = " + unicPercent);
    }

    static double unicPercent(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unicPercent = set.size() * 100.0 / arr.length;
        return unicPercent;
    }

    static Integer[] createArray(int capacity, int min, int max) {
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

}