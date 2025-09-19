package org.example;

public class Bao extends TaiLieu {
    private String ngayPhatHanh_144;

    public Bao(){}

    public Bao(String maTaiLieu_144, String tenNhaXuatBan_144, int soBanPhatHang_144, String ngayPhatHanh_144) {
        super(maTaiLieu_144, tenNhaXuatBan_144, soBanPhatHang_144);
        this.ngayPhatHanh_144 = ngayPhatHanh_144;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap ngay phat hanh: ");
        ngayPhatHanh_144 = sc_144.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh_144);
    }
}
