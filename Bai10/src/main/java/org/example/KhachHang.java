package org.example;

import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo_144;
    protected int soNha_144;
    protected String maCongTo_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public KhachHang() {

    }

    public KhachHang(String tenChuHo_144, int soNha_144, String maCongTo_144) {
        this.tenChuHo_144 = tenChuHo_144;
        this.soNha_144 = soNha_144;
        this.maCongTo_144 = maCongTo_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo_144 = sc_144.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha_144 = sc_144.nextInt();
        sc_144.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo_144);
        System.out.println("\tSo nha: " + soNha_144);
        System.out.println("\tMa cong to: " + maCongTo_144);
    }
}
