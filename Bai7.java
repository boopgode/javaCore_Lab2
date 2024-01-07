package com.devmaster.baitap;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Bai7 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 4 số nguyên: ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();

        int max = Math.max(Math.max(a,b), Math.max(c,d));
        System.out.println("Số lớn nhất trong 4 số là :  "+max);

    }
}
