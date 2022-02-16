/**
 * Java 1. Home work №3
 *
 * @author Svetlana Sushentceva
 * @version 16.02.2022
 */

package ru.geekbrainns.home_work_3;

import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        changeArray();
        array();
        changeArrayLessThanSix();
        fillDiagonals();
        System.out.println(Arrays.toString(returningArray(6, 20)));
        searchMinMax();

    }

//   static void changeArray() {
//        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                nums[i] = 1;
//            } else {
//                nums[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    static void changeArray() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    static void array() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArrayLessThanSix() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void fillDiagonals() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - i - 1] = 1;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

//    static int[] returningArray(int len, int initialValue) {
//        int array[] = new int[len];
//         for (int i = 0; i < array.length; i++) {
//             array[i] = initialValue;
//         }
//        return array;
//    }

    static int[] returningArray(int len, int initialValue) {
        int array[] = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    static void searchMinMax() {
        int[] arr = {10, 5, 3, 8, 80, 4, 25, 38, 41, 18, 9, 1};
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i] < min ? arr[i] : min;
            max = arr[i] > max ? arr[i] : max;
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }

}
