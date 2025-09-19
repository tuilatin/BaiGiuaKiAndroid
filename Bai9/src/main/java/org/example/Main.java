package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QuanLy quanLy_144 = new QuanLy();
        quanLy_144.nhapDanhSach();
        System.out.println("Danh sách sinh viên, tên sách mượn cần trả vào cuối tháng");
        quanLy_144.hienThiDanhSachTraCuoiThang();
    }
}