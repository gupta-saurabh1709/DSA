package BitsInJava;

public class CountSetBitsInANumber {
    public static void main(String[] args) {
        int num=3;
        System.out.println(countSetBits(num));
    }

    private static int countSetBits(int num) {
        int count=0;
        while(num>0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}
