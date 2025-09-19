package org.example;

import java.util.Scanner;

class NhanVien extends CanBo {
    private String congViec_144;

    public NhanVien() {}

    public NhanVien(String hoTen_144, String ngaySinh_144, String gioiTinh_144, String diaChi_144, String congViec_144) {
        super(hoTen_144, ngaySinh_144, gioiTinh_144, diaChi_144);
        this.congViec_144 = congViec_144;
    }

    public void nhapThongTin(Scanner sc_144) {
        super.nhapThongTin(sc_144);
        System.out.println("Nhap cong viec: ");
        congViec_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec_144);
    }
}

