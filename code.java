package first;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wanna take action on it");
        int number = input.nextInt();
        int numberStorage=number;
        int value=0;
        int total = 0;
        while(numberStorage!=0){
            value=numberStorage%10;
            total+=value;
            numberStorage/=10;
        }
        System.out.println(total);
    }
}
