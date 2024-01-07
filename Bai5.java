package com.devmaster.baitap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số nguyên N:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("N là số chẵn");
        } else System.out.println("N là số lẻ");
    }
}
