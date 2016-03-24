package com.company;

import java.util.Scanner;

public class SumFrom1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputstr = sc.nextLine();
        int input = Integer.parseInt(inputstr);
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
