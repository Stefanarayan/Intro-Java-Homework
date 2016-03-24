package com.company;

import java.util.Scanner;

public class CharacterTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputstr = sc.nextLine();
        int input = Integer.parseInt(inputstr);
        char letters = 'a';
        int count = 1;

        System.out.println(input);

        while (count < input) {
            for (int i = 0; i <= count; i++) {
                System.out.print(letters + " ");
                letters++;
            }
            System.out.println();
            count++;
            letters = 'a';
        }

        while (count > 1) {
            for (int i = count; i > 1 ; i--) {
                System.out.print(letters + " ");
                letters++;
            }
            System.out.println();
            count--;
            letters = 'a';
        }
    }
}
