package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        int x_144 = 1;
        QuanLyTaiLieu listTaiLieu_144 = new QuanLyTaiLieu();

        while(x_144 != 0) {
            System.out.println("1. Nhập tài liệu");
            System.out.println("2. Tìm kiếm theo loại(nhập số) 1. Sách ; 2. Tạp chí ; 3. Báo");
            System.out.println("3. Tìm kiếm theo mã tài liệu");
            System.out.println("0. Thoát");
            x_144 = sc_144.nextInt();
            sc_144.nextLine();
            switch (x_144) {
                case 1:
                    listTaiLieu_144.nhapDanhSachTL();
                    break;
                case 2:
                    System.out.println("Nhập số: ");
                    int y_144 = sc_144.nextInt();
                    listTaiLieu_144.timKiemTheoLoaiTaiLieu(y_144);
                    break;
                case 3:
                    System.out.println("Nhập mã tài liệu: ");
                    String ma_144 = sc_144.nextLine();
                    listTaiLieu_144.timKiemTheoMaTaiLieu(ma_144);
                    break;
                default:
                    break;
            }
        }

    }
}