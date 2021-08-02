package BitsInJava;

import java.util.Scanner;

public class NonRepeatingDigitUsingBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        System.out.println("Non repeating digit in the number is :");
        findNonRepeatingDigit(num);
    }

    private static void findNonRepeatingDigit(int num) {
        int nonRep=0;
        int rem;
        while(num>0){
            rem=0;
            rem=num%10;
            nonRep=nonRep^rem;
            num=num/10;
        }
        System.out.println(nonRep);
    }
}
