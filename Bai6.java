package com.devmaster.baitap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào 3 số nguyên a,b,c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>0&b>0&c>0){
            if ((a+b>c)&(a+c>b)&(c+b>a))
            {
                System.out.println("3 số a b c tạo thành 1 tam giác");
                int chuvi = a+c+b;
                float s = chuvi/2;
                double dientich=Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("chu vi hình tam giác trên là : " +chuvi);
                System.out.println("diện tích hình tam giác trên là : "+dientich);
            }
            else System.out.println("3 số a b c không tạo thành 1 tam giác ");
        }else System.out.println("3 số a b c không tạo thành 1 tam giác ");
    }
}
