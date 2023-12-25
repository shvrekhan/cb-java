package fundamental;

import java.util.Scanner;

public class PythagorasTriplet {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number2,number3;


        if(number < 3){
            System.out.print(-1);
            return;
        }

        if(number % 2 == 0){
            number2 = ((number/2)*(number/2)) - 1;
            number3 = number2+2;
        }else{
            number2 = (number*number-1)/2;
            number3 = number2+1;

        }
        if((number*number) + (number2*number2) == (number3*number3)){
            System.out.print(number2+" ");
            System.out.print(number3);
        }else{
            System.out.print(-1);
        }
    }

}
