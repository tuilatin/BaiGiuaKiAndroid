package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QuanLy quanLy_144 = new QuanLy();
        quanLy_144.nhapDanhSach();
        System.out.println("Những cán bộ có lương thực lĩnh hơn 8 triệu: ");
        quanLy_144.timKiem(8000000);
    }
}