package tasks.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        // Реализовать сортировку пузырьком переданного массива
        int i = 0;
        int k = 0;
        for (k = 0; k < array.length - 1; k++)
            for (i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int j = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = j;
                }
            }

    }
}



