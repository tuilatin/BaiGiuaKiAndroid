package org.example;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen_144;
    protected String ngaySinh_144;
    protected String queQuan_144;
    Scanner sc_144 = new Scanner(System.in);

    public Nguoi() {

    }

    public Nguoi(String hoTen_144, String ngaySinh_144, String queQuan_144) {
        this.hoTen_144 = hoTen_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.queQuan_144 = queQuan_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap ho ten: ");
        hoTen_144 = sc_144.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh_144 = sc_144.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_144);
        System.out.println("\tNgay sinh: " + ngaySinh_144);
        System.out.println("\tQue quan: " + queQuan_144);
    }
}

