package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QuanLy quanLy_144 = new QuanLy();
        quanLy_144.nhapDanhSach();
        System.out.print("Hien thi bien lai da nhap: ");
        quanLy_144.hienThiDanhSach();   
    }
}