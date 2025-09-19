package org.example;

import java.util.Scanner;

class CongNhan extends CanBo {
    private String bac_144;

    public CongNhan() {}

    public CongNhan(String hoTen_144, String ngaySinh_144, String gioiTinh_144, String diaChi_144, String bac_144) {
        super(hoTen_144, ngaySinh_144, gioiTinh_144, diaChi_144);
        this.bac_144 = bac_144;
    }

    public void nhapThongTin(Scanner sc_144) {
        super.nhapThongTin(sc_144);
        System.out.println("Bac: ");
        bac_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bac: " + bac_144);
    }
}