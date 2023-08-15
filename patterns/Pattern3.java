import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        for (int index = 0; index < numberOfRows; index++) {
            for (int internalIndex = numberOfRows - index; internalIndex > 0; internalIndex--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
