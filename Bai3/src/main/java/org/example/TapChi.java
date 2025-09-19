package org.example;

public class TapChi extends TaiLieu {
    private String soPhatHanh_144;
    private int thangPhatHang_144;

    public TapChi() {}

    public TapChi(String maTaiLieu_144, String tenNhaXuatBan_144, int soBanPhatHang_144, String soPhatHanh_144, int thangPhatHang_144) {
        super(maTaiLieu_144, tenNhaXuatBan_144, soBanPhatHang_144);
        this.soPhatHanh_144 = soPhatHanh_144;
        this.thangPhatHang_144 = thangPhatHang_144;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh_144 = sc_144.nextLine();
        System.out.println("Nhap thang phat hanh: ");
        thangPhatHang_144 = sc_144.nextInt();
    }

    public void xuat(){
        super.xuat();
        System.out.println("So phat hanh: " + soPhatHanh_144);
        System.out.println("Thang phat hanh: " + thangPhatHang_144);
    }
}
