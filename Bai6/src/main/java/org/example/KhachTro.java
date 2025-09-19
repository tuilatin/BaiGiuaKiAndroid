package org.example;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro_144;
    private String loaiPhong_144;
    private double giaPhong_144;

    public KhachTro() {

    }

    public KhachTro(String hoTen_144, int CMND_144, int soNgayTro_144, String loaiPhong_144, double giaPhong_144) {
        this.hoTen_144 = hoTen_144;
        this.CMND_144 = CMND_144;
        this.soNgayTro_144 = soNgayTro_144;
        this.loaiPhong_144 = loaiPhong_144;
        this.giaPhong_144 = giaPhong_144;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("\tNhap so ngay tro: ");
        soNgayTro_144 = sc_144.nextInt();
        sc_144.nextLine();
        System.out.print("\tNhap loai phong: ");
        loaiPhong_144 = sc_144.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong_144 = sc_144.nextDouble();
        sc_144.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro_144);
        System.out.println("\tLoai phong: " + loaiPhong_144);
        System.out.println("\tGia phong: " + giaPhong_144);
    }

    public int getSoNgayTro() {
        return soNgayTro_144;
    }

    public double getGiaPhong() {
        return giaPhong_144;
    }
}