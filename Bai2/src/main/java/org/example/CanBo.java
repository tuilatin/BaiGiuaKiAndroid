package org.example;

import java.util.Date;
import java.util.Scanner;

public class CanBo {
    private String hoTen_144;
    private String ngaySinh_144;
    private String gioiTinh_144;
    private String diaChi_144;

    public CanBo() {}

    public CanBo(String hoTen_144, String ngaySinh_144, String gioiTinh_144, String diaChi_144) {
        this.hoTen_144 = hoTen_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.gioiTinh_144 = gioiTinh_144;
        this.diaChi_144 = diaChi_144;
    }

    public void nhapThongTin(Scanner sc_144) {
        System.out.println("Nhap ho ten: ");
        hoTen_144 = sc_144.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh_144 = sc_144.nextLine();
        System.out.println("Gioi tinh: ");
        gioiTinh_144 = sc_144.nextLine();
        System.out.println("Dia chi: ");
        diaChi_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen_144);
        System.out.println("Ngay sinh: " + ngaySinh_144);
        System.out.println("Gioi tinh: " + gioiTinh_144);
        System.out.println("Dia chi: " + diaChi_144);
    }

    public String getHoTen_144() {
        return hoTen_144;
    }
}
