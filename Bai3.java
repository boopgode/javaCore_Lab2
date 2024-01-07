package com.devmaster.baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem ly thuyet:");
        float diemLT = sc.nextFloat();
        System.out.println("nhap diem thuc hanh:");
        float diemTH = sc.nextFloat();

        if(diemLT <4){
            System.out.println("Thi lai ly thuyet !!!");
        }
        if(diemTH <4){
            System.out.println("Thi lai thuc hanh !!!");
        }

        float diemTB=(diemLT+diemTH)/2;

        System.out.println("diem trung binh :"+diemTB);
        if(diemTB<4){
            System.out.println("SV phai hoc lai");
        } else if (diemTB <7) {
            System.out.println("sv dat mon java");
        }else {
            System.out.println("sv xuaat sac");
        }
    }

}
