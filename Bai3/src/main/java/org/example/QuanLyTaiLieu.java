package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTaiLieu {
    List<TaiLieu> listTaiLieu_144;
    Scanner sc_144 = new Scanner(System.in);

    public QuanLyTaiLieu() {
        listTaiLieu_144 = new ArrayList<TaiLieu>();
    }

    public void themTaiLieu(TaiLieu t_144) {
        listTaiLieu_144.add(t_144);
    }

    public void nhapDanhSachTL(){
        TaiLieu taiLieu_144 = new TaiLieu();
        System.out.println("Chọn loại tài liệu bạn cần nhập(nhập số) 1. Sách ; 2. Tạp chí ; 3. Báo");
        int chon_144 = sc_144.nextInt();
        sc_144.nextLine();
        switch (chon_144) {
            case 1:
                taiLieu_144 = new Sach();
                break;
            case 2:
                taiLieu_144 = new TapChi();
                break;
            case 3:
                taiLieu_144 = new Bao();
                break;
            default:
                break;
        }
        taiLieu_144.nhap();
        listTaiLieu_144.add(taiLieu_144);
    }

    public void timKiemTheoMaTaiLieu(String maTaiLieu_144) {
        for(TaiLieu taiLieu_144 : listTaiLieu_144) {
            if(maTaiLieu_144.equals(taiLieu_144.getMaTaiLieu_144())) {
                taiLieu_144.xuat();
            }
        }
    }

    public void timKiemTheoLoaiTaiLieu(int loaiTaiLieu_144) {
        if(loaiTaiLieu_144 == 1) {
            for (TaiLieu t_144 : listTaiLieu_144) {
                if (t_144 instanceof Sach) {
                    t_144.xuat();
                    System.out.println("\n");
                }
            }
        }

        if(loaiTaiLieu_144 == 2) {
            for (TaiLieu t_144 : listTaiLieu_144) {
                if (t_144 instanceof TapChi) {
                    t_144.xuat();
                }
            }
        }
        if(loaiTaiLieu_144 == 3) {
            for (TaiLieu t_144 : listTaiLieu_144) {
                if (t_144 instanceof Bao) {
                    t_144.xuat();
                }
            }
        }
    }
}
