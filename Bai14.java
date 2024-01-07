package com.devmaster.baitap;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện cũ:");
        int dienCu = sc.nextInt();
        System.out.println("Nhập số điện Mới:");
        int dienMoi = sc.nextInt();

        if (dienMoi < dienCu) {
            System.out.println("số điện mới không được nhỏ hơn số cũ !!!");
            return;
        }
        int soDien = dienMoi - dienCu;
        int tienThue = 1000;
        int dinhMuc = 50;
        int giaDien = 230;
        int giaBac1 = 480;
        int giaBac2 = 700;
        int giaBac3 = 900;
        //  tiền định mức
        int a = Math.min(dinhMuc, soDien) * giaDien;
        // tiền vượt định mức
        int b = 0;

        if (soDien > dinhMuc) {
            int bac1 = Math.min(soDien - dinhMuc, 50);
            int bac2 = Math.min(soDien - dinhMuc - 50, 50);
            int bac3 = Math.max(soDien - dinhMuc - 100, 0);

            b = bac1 * giaBac1 + bac2 * giaBac2 + bac3 * giaBac3;
        }
        int tongTien = a + b + tienThue;

        System.out.println("Số điện cũ: " + dienCu+"KW");
        System.out.println("Số điện mới: " + dienMoi+"KW");
        System.out.println("Tiền trả định mức: " + a+"đ");
        System.out.println("Tiền trả vượt định mức: " + b+"đ");
        System.out.println("Tổng tiền phải trả: " + tongTien+"đ");
    }
}
