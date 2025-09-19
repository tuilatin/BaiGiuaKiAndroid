package org.example;

import java.util.Scanner;

class KySu extends CanBo {
    private String nganhDaoTao_144;

    public KySu() {}

    public KySu(String hoTen_144, String ngaySinh_144, String gioiTinh_144, String diaChi_144, String nganhDaoTao_144) {
        super(hoTen_144, ngaySinh_144, gioiTinh_144, diaChi_144);
        this.nganhDaoTao_144 = nganhDaoTao_144;
    }

    public void nhapThongTin(Scanner sc_144) {
        super.nhapThongTin(sc_144);
        System.out.println("Nganh dao tao: ");
        nganhDaoTao_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao_144);
    }
}