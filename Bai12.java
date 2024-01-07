package com.devmaster.baitap;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập điểm Toán:");
        double diemT= sc.nextDouble();
        System.out.println("nhập điểm Lý:");
        double diemL= sc.nextDouble();
        System.out.println("nhập điểm Hoá:");
        double diemH= sc.nextDouble();

        double tong=diemH+diemL+diemT;

        if (tong>=15&diemT>=4&diemL>=4&diemH>=4){
            System.out.println("Đậu");
            if (diemH>5&diemL>5&diemT>5){
                System.out.println("Học đều các môn");
            }else System.out.println("Chưa học đều các môn");
        }else System.out.println("Thi hỏng");
    }
}
