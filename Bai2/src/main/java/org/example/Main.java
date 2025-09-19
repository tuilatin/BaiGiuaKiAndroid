package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_144 = new Scanner(System.in);
        QLCB qlcb_144 = new QLCB();
        int x_144 = 1;
        String hoTen_144;
        while(x_144 > 0) {
            System.out.println("1. Phím 1 nhập thông tin mới cho cán bộ");
            System.out.println("2. Phím 2 tìm kiếm theo họ tên và hiển thị cán bộ tìm được");
            System.out.println("0. Thoát");
            x_144 = sc_144.nextInt();
            sc_144.nextLine();
            if(x_144 == 1)
                qlcb_144.nhapDanhSach(sc_144);
            if(x_144 == 2) {
                System.out.println("Nhập họ tên cán bộ muốn tìm: ");
                hoTen_144 = sc_144.nextLine();
                qlcb_144.timKiemCanBo(hoTen_144);
            }
        }

    }
}