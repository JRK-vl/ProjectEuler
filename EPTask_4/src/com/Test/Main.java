package com.Test;

public class Main {

    public static boolean isPalindrome(int[] arr){
        boolean isPalindrome = false;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == arr[arr.length-1-i]){
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
        }
        return (isPalindrome);
    }

    public static void main(String[] args) {
        int x = 999;
        int y = 998;
        int sum;
        int []palindrome = new int [6];
        int max = 0;

        for (int i = x; i > 900; i--) {
            for (int j = y; j > 900; j--) {
                sum = i*j;
                int num = sum;
                for (int p = palindrome.length-1; p >= 0; p--) {
                    palindrome[p] = num % 10;
                    num /= 10;
                }
                if (isPalindrome(palindrome) && sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
