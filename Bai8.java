package com.devmaster.baitap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int thang;
        do {
            System.out.println("nhập vào tháng: ");
            thang = sc.nextInt();
            if (thang>12||thang<0) System.out.println("Nhập sai, vui lòng nhập lại...");
            else {
                switch (thang) {
                    case 1:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 3:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 4:
                        System.out.println("Tháng này có 31 ngày ");
                        break;
                    case 5:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 6:
                        System.out.println("Tháng này có 31 ngày ");
                        break;
                    case 7:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 8:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 9:
                        System.out.println("Tháng này có 31 ngày ");
                        break;
                    case 10:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    case 11:
                        System.out.println("Tháng này có 31 ngày ");
                        break;
                    case 12:
                        System.out.println("Tháng này có 30 ngày ");
                        break;
                    default:
                        System.out.println("Tháng này có 29 ngày ");
                }
            }
        }while ((thang>12)||(thang<0));{
        }
    }
}
