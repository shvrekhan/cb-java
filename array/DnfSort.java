package array;

import java.util.Scanner;
import java.util.*;

public class DnfSort {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {
        // Write your code here
        int zero = 0;
        int one =1;
        int two = nums.length-1;

        while()
        }
}
