package com.devmaster.baitap;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int x;
        int y;
        char toantu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 2 số x y: ");
        x = sc.nextInt();
        y = sc.nextByte();
        System.out.println("nhập vào toán tử cần thực viện:");
        toantu = sc.next().charAt(0);

        switch (toantu) {
            case '+':
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case '*':
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println(x + " / " + y + " = " + (x / y));
                } else {
                    System.out.println("Không thể chia cho 0.");
                }
                break;
            case '%':
                if (y != 0) {
                    System.out.println(x + " % " + y + " = " + (x % y));
                } else {
                    System.out.println("Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ");
        }
    }
}
