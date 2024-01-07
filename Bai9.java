package com.devmaster.baitap;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int id1;
        int id2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Người chơi 1 lựa chọn: \n1: Bao \n2: Búa\n3: Kéo ");
        id1= scanner.nextInt();
        System.out.println("Người chơi 2 lựa chọn: \n1: Bao \n2: Búa\n3: Kéo ");
        id2= scanner.nextInt();

        switch (id1){
            case 1:
                switch (id2){
                    case 1:
                        System.out.println("Kết quả: Hoà");
                        break;
                    case 2:
                        System.out.println("Kết quả: Người chơi 1 chiến thắng");
                        break;
                    case 3:
                        System.out.println("Kết quả: Người chơi 2 chiến thắng");
                        break;
                }
                break;
            case 2:
                switch (id2){
                    case 1:
                        System.out.println("Kết quả: Người chơi 2 chiến thắng");
                        break;
                    case 2:
                        System.out.println("Kết quả: Hoà");
                        break;
                    case 3:
                        System.out.println("Kết quả: Người chơi 1 chiến thắng");

                        break;
                }
                break;
            case 3:
                switch (id2){
                    case 1:
                        System.out.println("Kết quả: Người chơi 1 chiến thắng");
                        break;
                    case 2:
                        System.out.println("Kết quả: Người chơi 2 chiến thắng");
                        break;
                    case 3:
                        System.out.println("Kết quả: Hoà");
                        break;
                }
                break;
        }
    }
}
