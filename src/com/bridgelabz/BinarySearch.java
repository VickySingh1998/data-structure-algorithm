package com.bridgelabz;

public class BinarySearch {
    public static int binarySearch(String[] arr, String x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middleValue = left + (right - left) / 2;

            int result = x.compareTo(arr[middleValue]);

            // Check if x is present at mid
            if (result == 0)
                return middleValue;

            // If x greater, ignore left half
            if (result > 0)
                left = middleValue + 1;

                // If x is smaller, ignore right half
            else
                right = middleValue - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        String[] arr = {"contribute", "geeks", "ide", "practice"};
        String x = "geeks";
        int result = binarySearch(arr, x);// by using binary search, in an arr it will search for x word

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
