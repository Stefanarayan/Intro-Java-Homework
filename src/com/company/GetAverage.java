package com.company;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("%.2f", (average(a,b,c)));
    }

    private static double average(double x, double y, double z) {
        double sum = x + y + z;
        double average = sum / 3;
        return average;
    }
}
