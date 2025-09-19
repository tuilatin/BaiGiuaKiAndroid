package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds_144;
    Scanner sc_144 = new Scanner(System.in);

    public KhachSan() {
        ds_144 = new ArrayList<KhachTro>(10);
    }

    public void themKhachTro(KhachTro kt_144) {
        ds_144.add(kt_144);
    }

    public void nhapDanhSach() {
        KhachTro khach_144;

        System.out.print("Nhap vao so luong khach: ");
        int n_144 = sc_144.nextInt();
        sc_144.nextLine();

        System.out.println("Nhap vao thong tin khach tro:");
        for (int i_144 = 0; i_144 < n_144; i_144++) {
            System.out.println("Khach tro thu " + (i_144 + 1) + " la:");
            khach_144 = new KhachTro();
            khach_144.nhapThongTin();
            themKhachTro(khach_144);
        }
    }

    public void hienThiDanhSach() {
        for (KhachTro khach_144 : ds_144) {
            khach_144.hienThiThongTin();
        }
    }

    public double tinhTien(int CMND_144) {
        double tien_144 = 0;

        for (KhachTro khach_144 : ds_144) {
            if (khach_144.getCMND() == CMND_144) {
                tien_144 = khach_144.getSoNgayTro() * khach_144.getGiaPhong();
            }
        }

        return tien_144;
    }
}
