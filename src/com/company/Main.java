package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите любое целое положительное число n");
        Scanner N = new Scanner(System.in);
        int NN = N.nextInt();
        int sum = 0;
        for (int i = 1; i <= NN; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
