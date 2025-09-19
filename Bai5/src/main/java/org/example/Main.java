package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        KhuPho khuPho_144 = new KhuPho();
        khuPho_144.nhapDanhSach();
        System.out.println("Hiển thị...");
        khuPho_144.timKiemThongTin();
    }
}