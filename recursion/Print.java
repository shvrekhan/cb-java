package recursion;

import java.util.*;

public class Print {

    public void printRec(int number) {
        if(number<=0) return;
        printRec(number-1);
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print p = new Print();
        p.printRec(n);
    }
}
