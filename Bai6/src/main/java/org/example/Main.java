package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        System.out.println("1. Nhập số khách trọ");
        System.out.println("2. Hiển thị thông tin những người đang ở khách sạn");
        System.out.println("3. Tính số tiền cần phải trả cho phòng trọ");
        KhachSan khachSan_144 = new KhachSan();
        khachSan_144.nhapDanhSach();
        System.out.println("Thông tin những khách đang ở trọ: ");
        khachSan_144.hienThiDanhSach();
        System.out.println("Tính số tiền cho một khách hàng trả phòng trọ");
        System.out.println("Nhập số cccd: ");
        int cccd_144 = sc_144.nextInt();
        System.out.println("Số tiền cần phải trả của khách này " + khachSan_144.tinhTien(cccd_144));

    }
}