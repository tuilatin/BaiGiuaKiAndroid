package org.example;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung_144;
    private double thuong_144;
    private double phat_144;
    private double luongThucLinh_144;

    public CBGV() {}

    public void nhapThongTin() {
        super.nhapThongTin();

        System.out.print("\tNhap luong cung: ");
        luongCung_144 = sc_144.nextDouble();
        sc_144.nextLine();

        System.out.print("\tNhap thuong: ");
        thuong_144 = sc_144.nextDouble();
        sc_144.nextLine();

        System.out.print("\tNhap phat: ");
        phat_144 = sc_144.nextDouble();
        sc_144.nextLine();

        luongThucLinh_144 = luongCung_144 + thuong_144 - phat_144;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLuong cung: " + luongCung_144);
        System.out.println("\tThuong: " + thuong_144);
        System.out.println("\tPhat: " + phat_144);
        System.out.println("\tLuong thuc linh: " + luongThucLinh_144);
    }

    public double getLuongThucLinh() {
        return luongThucLinh_144;
    }
}

