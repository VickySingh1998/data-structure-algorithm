package com.bridgelabz;

public class InsertionSort {
    static void printArray(int[] arr) {

        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }
    void sort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
    public static void main(String[] args) {

        int[] arr = {9, 32, 78, 66, 1, 5};
        InsertionSort object = new InsertionSort();
        object.sort(arr);

        printArray(arr);
    }
}
