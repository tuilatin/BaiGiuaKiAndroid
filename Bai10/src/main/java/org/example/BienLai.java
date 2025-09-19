package org.example;

import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi_144;
    private int chiSoCu_144;
    private double tien_144;

    public BienLai() {

    }

    public BienLai(int chiSoMoi_144, int chiSoCu_144, double tien_144) {
        this.chiSoMoi_144 = chiSoMoi_144;
        this.chiSoCu_144 = chiSoCu_144;
        this.tien_144 = tien_144;
    }

    public BienLai(String tenChuHo_144, int chiSoMoi_144, int chiSoCu_144, double tien_144) {
        this.tenChuHo_144 = tenChuHo_144;
        this.chiSoMoi_144 = chiSoMoi_144;
        this.chiSoCu_144 = chiSoCu_144;
        this.tien_144 = tien_144;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi_144 = sc_144.nextInt();
        sc_144.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu_144 = sc_144.nextInt();
        sc_144.nextLine();
        tien_144 = (chiSoMoi_144 - chiSoCu_144) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi_144);
        System.out.println("\tChi so cu: " + chiSoCu_144);
        System.out.println("\tTien dien phai tra: " + tien_144);
    }
}

