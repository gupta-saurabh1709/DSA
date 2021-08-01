package BitsInJava;

import java.util.Scanner;

public class EvenAndOddUsingBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        System.out.println("Check Whether Entered Number is Odd or Even :");
        checkEvenOdd(num);
    }

    private static void checkEvenOdd(int num) {
        if ((num & 1) == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
