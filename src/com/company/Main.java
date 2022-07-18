package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = number / 100000;
        int b = number / 10000 % 10;
        int c = number / 1000 % 100 % 10;
        int sum1 = a + b + c;
        int d = number / 100 % 10;
        int e = number / 10 % 10;
        int f = number % 10;
        int sum2 = d + e + f;
        if (sum1 == sum2) {
            System.out.println("Happy number! :)");
        }
        else {
            System.out.println("Unhappy number ;(");
        }

    }
}
