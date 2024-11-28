package a1128.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 17, 22, 11, 90 };
        SelectionSort(array);
        System.out.println();
        System.out.println("선택정렬로 정렬된 배열 : "+Arrays.toString(array));
    }

    public static void SelectionSort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }



    }
}
