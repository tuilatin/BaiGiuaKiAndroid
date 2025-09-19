package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public KhuPho() {
        dshd_144 = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan_144) {
        dshd_144.add(hoDan_144);
    }

    public void nhapDanhSach() {
        HoDan hoDan_144;

        System.out.print("Nhap vao so ho dan: ");
        int soHoDan_144 = sc_144.nextInt();
        sc_144.nextLine();

        System.out.println("Nhap vao thong tin cho tung ho dan:");
        for (int i_144 = 0; i_144 < soHoDan_144; i_144++) {
            System.out.println("Ho dan thu " + (i_144 + 1) + " la:");
            hoDan_144 = new HoDan();
            hoDan_144.nhapThongTin();
            themHoDan(hoDan_144);
        }
    }

    public void hienThiDanhSach() {
        int n_144 = dshd_144.size();

        for (int i_144 = 0; i_144 < n_144; i_144++) {
            System.out.println("Ho dan thu " + (i_144 + 1) + " la:");
            dshd_144.get(i_144).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now_144 = new Date();
        int namHienTai_144 = now_144.getYear() + 1900;
        Nguoi[] dstv_144 = null;
        for (HoDan hoDan_144 : dshd_144) {
            dstv_144 = hoDan_144.getList();
            for (int i_144 = 0; i_144 < hoDan_144.getSoNguoi(); i_144++) {
                if (namHienTai_144 - (dstv_144[i_144].getNgaySinh().getYear() + 1900) == 80) {
                    System.out.println("Hộ dân này có người thượng thọ");
                    hoDan_144.hienThiThongTin();
                }
            }
        }
    }
}
