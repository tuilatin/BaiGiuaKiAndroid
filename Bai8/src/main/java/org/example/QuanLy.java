package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public QuanLy() {
        ds_144 = new ArrayList<CBGV>(10);
    }

    public void themCBGV(CBGV canBo_144) {
        ds_144.add(canBo_144);
    }

    public void nhapDanhSach() {
        CBGV canBo_144;

        System.out.print("Nhap vao so luong can bo: ");
        int n_144 = sc_144.nextInt();
        sc_144.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n_144; i++) {
            System.out.println("Can bo thu " + (i + 1) + " la:");
            canBo_144 = new CBGV();
            canBo_144.nhapThongTin();
            themCBGV(canBo_144);
        }
    }

    public void hienThiDanhSach() {
        for (CBGV cb_144 : ds_144) {
            cb_144.hienThiThongTin();
        }
    }

    public void timKiem(double luong_144) {
        for (CBGV cb_144 : ds_144) {
            if (cb_144.getLuongThucLinh() >= luong_144) {
                cb_144.hienThiThongTin();
            }
        }
    }
}
