package org.example;

import java.util.Scanner;

public class SinhVien {
    protected String hoTen_144;
    protected String maSV_144;
    protected String ngaySinh_144;
    protected String lop_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public SinhVien() {

    }

    public SinhVien(String hoTen_144, String maSV_144, String ngaySinh_144, String lop_144) {
        this.hoTen_144 = hoTen_144;
        this.maSV_144 = maSV_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.lop_144 = lop_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap ho ten: ");
        hoTen_144 = sc_144.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV_144 = sc_144.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh_144 = sc_144.nextLine();

        System.out.print("\tNhap lop: ");
        lop_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_144);
        System.out.println("\tNgay sinh: " + ngaySinh_144);
        System.out.println("\tMa sinh vien: " + maSV_144);
        System.out.println("\tLop: " + lop_144);
    }
}
