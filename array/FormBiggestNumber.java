package array;

import java.util.Objects;
import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int numberOfInput = sc.nextInt();
            String[] arr = new String[numberOfInput];
            for (int index = 0; index < numberOfInput; index++) {
                arr[index] = "" + sc.nextInt();
            }
            System.out.println(findGreatestNumber(arr, numberOfInput));
            testCases--;
        }
    }

    public static String findGreatestNumber(String[] arr, int numberOfInput) {

        for (int index = 0; index < numberOfInput - 1; index++) {
            for (int jIndex = index + 1; jIndex < numberOfInput; jIndex++) {
                if (compare(arr[index], arr[jIndex])) {
                    String temp = arr[index];
                    arr[index] = arr[jIndex];
                    arr[jIndex] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numberOfInput; index++) {
            result.append(arr[index]);
        }
        int start = 0;
        while (Objects.equals(arr[start], "0") && start < numberOfInput - 1) {
            start++;
        }
        return result.substring(start);
    }

    public static boolean compare(String s1, String s2) {

//        System.out.println(s1+" "+s2);
        return s2.concat(s1).compareTo(s1.concat(s2)) > 0;
    }
}
