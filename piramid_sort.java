// Реализовать алгоритм пирамидальной сортировки (HeapSort).

package Task_4_6;

import java.util.Arrays;

public class piramid_sort {

    public static void heapify(int[] array, int length, int i) {  // преобразование в двоичную кучу с корнем i
        int left = 2 * i + 1;      // левый
        int right = 2 * i + 2;     // правый
        int largest = i;           // наибольший

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }

        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {             // если самый большой элемент не корень
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }

    }

    public static void heapSort(int [] array) {       
        if (array.length == 0) {        // если длина массива 0
            return;
        }

        int length = array.length;


        for (int index = length/2-1; index >= 0; index--) {  // перенпуппировка массива
            heapify(array, length, index);
        }

        for (int index = length - 1; index >= 0; index--) {   // извлечение элементов
            int temp = array[0];                              // перемещение текущего корня в конец
            array[0] = array[index];
            array[index] = temp;
            heapify(array, index, 0);
        }
    }

    public static void main(String[] args) {
        int [] array = {50, 10, 60, 40, 1, 30, 20};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}