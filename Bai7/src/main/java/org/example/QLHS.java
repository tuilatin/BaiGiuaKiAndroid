package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs_144;
    public static Scanner sc_144 =  new Scanner(System.in);

    public QLHS() {
        dshs_144 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs_144) {
        dshs_144.add(hs_144);
    }

    public void nhapDanhSachHS() {
        HocSinh hs_144;

        System.out.print("Nhap vao so luong hoc sinh: ");
        int n_144 = sc_144.nextInt();
        sc_144.nextLine(); // tránh lỗi xuống dòng

        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i_144 = 0; i_144 < n_144; i_144++) {
            System.out.println("\tHoc sinh thu " + (i_144 + 1) + " la:");

            hs_144 = new HocSinh();
            hs_144.nhapThongTin();

            themHS(hs_144);
        }
    }

    public void hienThiDanhSach() {
        int n_144 = dshs_144.size();
        for (int i_144 = 0; i_144 < n_144; i_144++) {
            System.out.println("\tHoc sinh thu " + (i_144 + 1) + " la:");
            dshs_144.get(i_144).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam, String que) {
        for (HocSinh hs : dshs_144) {
            if ((hs.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs.getQueQuan()))) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop) {
        for (HocSinh hs : dshs_144) {
            if (lop.equals(hs.getLop())) {
                hs.hienThiThongTin();
            }
        }
    }
}