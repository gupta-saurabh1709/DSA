package BitsInJava;

import java.util.Scanner;

public class EvenAndOddUsingMod {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        System.out.println("Check Whether Entered Number is Odd or Even :");
        checkEvenOdd(num);
        long end = System.nanoTime();
        long execution = (end - start);
        System.out.println("Execution time of Recursive Method is");
        System.out.println(execution + " nanoseconds");
    }

    private static void checkEvenOdd(int num) {
        if ((num % 2) == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
