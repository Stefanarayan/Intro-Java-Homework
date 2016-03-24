package com.company;

import java.util.Scanner;

public class GhettoNumeralSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputstr = sc.nextLine();

        String[] ghetto = { "Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack" };

        for (int i = 0; i < inputstr.length(); i++) {
            System.out.print(ghetto[Integer.parseInt(String.valueOf(inputstr.charAt(i)))]);
        }

    }
}
