package src.mean_of_array_after_removing_some_elements;

import java.util.Arrays;

class Solution {

    public static double trimMean(int[] arr) {
        return mean(removeTopPerc(arr, 0.05));
    }

    private static double mean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum / (double) arr.length;
    }

    private static int[] removeTopPerc(int[] arr, double p) {
        int rc = (int) (p * arr.length);
        if (arr.length >= 20) {
            Arrays.sort(arr);
        }
        return Arrays.copyOfRange(arr, rc, arr.length - rc);
    }

    public static void main(String[] args) {
        int[] array = { 4, 8, 4, 10, 0, 7, 1, 3, 7, 8, 8, 3, 4, 1, 6, 2, 1, 1, 8, 0, 9, 8, 0, 3, 9, 10, 3, 10, 1, 10, 7,
                3, 2, 1, 4, 9, 10, 7, 6, 4, 0, 8, 5, 1, 2, 1, 6, 2, 5, 0, 7, 10, 9, 10, 3, 7, 10, 5, 8, 5, 7, 6, 7, 6,
                10, 9, 5, 10, 5, 5, 7, 2, 10, 7, 7, 8, 2, 0, 1, 1 };

        System.out.println("\n");
        System.out.println("Original Array (" + array.length + "):");
        System.out.println(Arrays.toString(array) + "\n");

        int[] trimmedArray = removeTopPerc(array.clone(), 0.05);
        System.out.println("Array trimmed (" + trimmedArray.length + "):");
        System.out.println(Arrays.toString(trimmedArray) + "\n");
        System.out.println();
        System.out.println("Trimmed mean is: " + trimMean(array));
        System.out.println("\n");
    }
}
