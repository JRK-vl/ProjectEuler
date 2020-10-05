package com.github;

public class Main {

    public static boolean isDivided(int num){
        boolean answer = false;
        for (int i = 1; i <= 20; i++) {
            if (num%i == 0){
                answer = true;
            }
            else {
                answer = false;
                break;
            }
        }
        return (answer);
    }

    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        while (num == 0){
            if (isDivided(i)){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
