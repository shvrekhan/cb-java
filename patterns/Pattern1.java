import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfRows = sc.nextInt();

            for (int index = 1; index <= numberOfRows; index++) {
                for (int internalIndex = 1; internalIndex <= index; internalIndex++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
