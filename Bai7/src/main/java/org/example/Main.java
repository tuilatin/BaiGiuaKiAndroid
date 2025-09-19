package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QLHS ql_144 = new QLHS();
        ql_144.nhapDanhSachHS();
        System.out.println("Tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
        ql_144.timKiemThongTin(1985, "Thái Nguyên");
        System.out.println("Tất cả những học sinh học lớp 10A1");
        ql_144.timKiemThongTin("10A1");
    }
}