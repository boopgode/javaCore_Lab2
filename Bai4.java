package com.devmaster.baitap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = sc.nextInt();
        System.out.println("nhap b:");
        int b = sc.nextInt();
        System.out.println("nhap c:");
        int c = sc.nextInt();

        if (a == 0) {
            if (c == 0) {
                System.out.println("nghiem = 0");
            } else {
                double x = (double) -b / c;
                System.out.println("nghiem =" + x);
            }
        } else {
            float d = b * b - 4 * a * c;
            System.out.println("delta= " + d);
            if (d < 0)
                System.out.println("PT vo nghiem");
            else if (d == 0)
                System.out.printf("nghiem = %.2f " + (-b / (2 * a)));
            else {
                System.out.println("phuong trinh co 2 nghiem phan biet");
                System.out.printf("x1= %.3f", (-b + Math.sqrt(d)) / (2 * a));
                System.out.printf("\nx2= %.2f", (-b - Math.sqrt(d)) / (2 * a));
                System.out.println();
            }
        }

    }
}
