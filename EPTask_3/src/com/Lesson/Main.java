package com.Lesson;
import java.math.BigInteger;

public class Main {

    public static boolean isPrime (long num){
        BigInteger bigNum = BigInteger.valueOf(num);
        boolean probablePrime = bigNum.isProbablePrime((int) Math.log(num));
        return (probablePrime);
    }

    public static void main(String[] args) {
        long x = 600851475143L;
        long rightBorder = x;
        for (int i = 1; i <= rightBorder; i++) {
            if (isPrime(i) && x%i==0){
                if (isPrime(x/i)){
                    System.out.println("Final Prime number is: "+x/i);
                    break;
                }
                System.out.println("Next Prime number is: "+ i);
                rightBorder = rightBorder/i;
            }
        }
    }
}
