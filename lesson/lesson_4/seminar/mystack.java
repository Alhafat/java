package lesson.lesson_4.seminar;

public class mystack {
private    Integer[] arr = new Integer[10];
private    int size = 0;

    int size() {
        return size;
    }

    boolean empty() {
        return size == 0;
    }

    void push(int item) {
        if (size == arr.length) {
            Integer[] arr_2 = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, arr_2, 0, arr.length);
            arr = arr_2;
        }
        arr[size++] = item;
    }

    int peek() {
        return arr[size - 1];
    }

    int pop() {
        return arr[--size];
    }
}
