package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public QuanLy() {
        ds_144 = new ArrayList<TheMuon>(10);
    }

    public void themTheMuon(TheMuon theMuon_144) {
        ds_144.add(theMuon_144);
    }

    public void nhapDanhSach() {
        TheMuon theMuon_144;

        System.out.print("Nhap vao so luong the muon: ");
        int n_144 = sc_144.nextInt();
        sc_144.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n_144; i++) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            theMuon_144 = new TheMuon();
            theMuon_144.nhapThongTin();
            themTheMuon(theMuon_144);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the_144 : ds_144) {
            if (the_144.getHanTra_144().getDate() == 31 || the_144.getHanTra_144().getDate() == 30) {
                the_144.hienThiThongTin();
            }
        }
    }
}
