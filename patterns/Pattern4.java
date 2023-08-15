import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        for (int index = 0; index < numberOfRows; index++) {
            for (int columnIndex = 0; columnIndex < numberOfRows - index - 1; columnIndex++) {
                System.out.print(" ");
            }
            for (int columnIndex = 0; columnIndex <= index; columnIndex++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
