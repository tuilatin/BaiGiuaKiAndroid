package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QuanLyThiSinh quanLyThiSinh_144 = new QuanLyThiSinh();
        int x_144 = 1;

        while(x_144 > 0){
            System.out.println("1. Nhập thông tin các thí sinh");
            System.out.println("2. Tìm kiếm theo số báo danh hiển thị thông tin về một thí sinh");
            System.out.println("0. Thoát");
            x_144 = sc_144.nextInt();
            sc_144.nextLine();

            switch(x_144){
                case 1:
                    quanLyThiSinh_144.nhapDanhSach();
                    break;
                case 2:
                    System.out.println("Nhập số báo danh cần tìm: ");
                    int sbd_144 = sc_144.nextInt();
                    sc_144.nextLine();
                    quanLyThiSinh_144.timKiemThiSinh(sbd_144);
                    break;
                default:
                    break;
            }

        }

    }
}