package org.example;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu_144;
    private String tenNhaXuatBan_144;
    private int soBanPhatHanh_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public TaiLieu() {}

    public TaiLieu(String maTaiLieu_144, String tenNhaXuatBan_144, int soBanPhatHang_144) {
        this.maTaiLieu_144 = maTaiLieu_144;
        this.tenNhaXuatBan_144 = tenNhaXuatBan_144;
        this.soBanPhatHanh_144 = soBanPhatHang_144;
    }

    public void nhap(){
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu_144 = sc_144.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        tenNhaXuatBan_144 = sc_144.nextLine();
        System.out.println("So ban phat hanh: ");
        soBanPhatHanh_144 = sc_144.nextInt();
        sc_144.nextLine();
    }

    public void xuat(){
        System.out.println("Ma tai lieu: " + maTaiLieu_144);
        System.out.println("Ten nha xuat ban: " + tenNhaXuatBan_144);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_144);
    }

    public String getMaTaiLieu_144() {
        return maTaiLieu_144;
    }
}
