package com.devmaster.baitap;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số giờ làm :");
        double gioLam= sc.nextDouble();
        System.out.println("Nhập số lương trên giờ: ");
        double luongTrenGio = sc.nextDouble();
        double thuNhap;
        if (gioLam>40)
        {
            thuNhap=(40*luongTrenGio)+((gioLam-40)*(luongTrenGio*1.5));
        }else{
            thuNhap=gioLam*luongTrenGio;
        }
        System.out.println("Tổng thư nhập: "+thuNhap);

    }
}
