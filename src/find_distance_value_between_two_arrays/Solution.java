package src.find_distance_value_between_two_arrays;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.List;

public class Solution {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        List<Integer> arr2List = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        TreeSet<Integer> arr2Tree = new TreeSet<>(arr2List);

        int distance = 0;
        for (Integer i : arr1) {
            Integer lowestCeiling = arr2Tree.ceiling(i - d);
            if (lowestCeiling == null || lowestCeiling > i + d)
                distance++;
        }

        return distance;
    }

    public static int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        int[] arr1Clone = arr1.clone();
        int[] arr2Clone = arr2.clone();
        Arrays.sort(arr1Clone);
        Arrays.sort(arr2Clone);

        int i = 0;
        int j = 0;
        while (i < arr1Clone.length && j < arr2Clone.length) {
            if (arr2Clone[j] >= arr1Clone[i] - d) {
                if (arr2Clone[j] > arr1Clone[i] + d)
                    distance++;
                i++;
            } else if (j + 1 >= arr2Clone.length) {
                distance++;
                i++;
            } else
                j++;
        }

        return distance;
    }

    public static void main(String[] args) {

        int[] arr1 = { -3, 10, 2, 8, 0, 10 };
        int[] arr2 = { -9, -1, -4, -9, -8 };
        int d = 9;

        System.out.println("Args entered:\n");
        System.out.println("arr1 is: " + Arrays.toString(arr1) + "\n");
        System.out.println("arr2 is: " + Arrays.toString(arr2) + "\n");
        System.out.println("d is: " + d + "\n");
        System.out.println("Result: " + findTheDistanceValue2(arr1, arr2, d));
        System.out.println("\n");
    }
}
