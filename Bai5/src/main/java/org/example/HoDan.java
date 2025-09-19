package org.example;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    // thuoc tinh
    private int soNguoi_144;
    private int soNha_144;
    private Nguoi[] list_144; // list la mang danh sach chua cac thanh vien trong ho

    public HoDan() {
        list_144 = new Nguoi[10];
    }

    public HoDan(String hoTen_144, Date ngaySinh_144, String ngheNghiep_144, int soNguoi_144, int soNha_144) {
        super(hoTen_144, ngaySinh_144, ngheNghiep_144);
        this.soNguoi_144 = soNguoi_144;
        this.soNha_144 = soNha_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap so nguoi: ");
        soNguoi_144 = sc_144.nextInt();
        sc_144.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha_144 = sc_144.nextInt();
        sc_144.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i_144 = 0; i_144 < soNguoi_144; i_144++) {
            System.out.println("Nguoi thu " + (i_144 + 1) + " la:");
            list_144[i_144] = new Nguoi();
            list_144[i_144].nhapThongTin();
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi_144);
        System.out.println("\tSo nha: " + soNha_144);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i_144 = 0; i_144 < soNguoi_144; i_144++) {
            System.out.println("Nguoi thu " + (i_144 + 1) + " la:");
            list_144[i_144].hienThiThongTin();
        }
    }

    public Nguoi[] getList() {
        return list_144;
    }

    public int getSoNguoi() {
        return soNguoi_144;
    }
}
