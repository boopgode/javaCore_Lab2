package com.devmaster.baitap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào 1 ký tự chỉ màu sắc:");
        char n = sc.next().charAt(0);
//        System.out.println(n);
        if (n=='r'||n=='R') System.out.println("RED");
        else if (n=='g'||n=='G') System.out.println("GREEN");
        else if (n=='b'||n=='B') System.out.println("BLUE");
        else System.out.println("BLACK");
    }
}
