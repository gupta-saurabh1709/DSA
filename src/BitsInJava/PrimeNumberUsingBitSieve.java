package BitsInJava;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberUsingBitSieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Upto which you want prime Numbers:");
        int num= scan.nextInt();
        findPrime(num);
    }

    private static void findPrime(int num) {
        Boolean[] prime = new Boolean[num/2];
        Arrays.fill(prime,false);
        for (int i=3;i*i<num;i+=2){
            if(prime[i/2]==false){
                for (int j = i * i; j < num; j += i * 2)
                    prime[j / 2] = true;
            }
        }
        System.out.print("2 ");
        for (int i = 3; i < num ; i += 2)
            if (prime[i / 2] == false)
                System.out.print(i + " ");


    }
}
