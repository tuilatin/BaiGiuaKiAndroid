package org.example;

public class Sach  extends TaiLieu {
    private String tenTacGia_144;
    private int soTrang_144;

    public Sach() {}

    public Sach(String maTaiLieu_144, String tenNhaXuatBan_144, int soBanPhatHang_144, String tenTacGia, int soTrang) {
        super(maTaiLieu_144, tenNhaXuatBan_144, soBanPhatHang_144);
        this.tenTacGia_144 = tenTacGia;
        this.soTrang_144 = soTrang;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap ten tac gia: ");
        tenTacGia_144 = sc_144.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang_144 = sc_144.nextInt();
        sc_144.nextLine();
    }

    public void xuat(){
        super.xuat();
        System.out.println("Nhap ten tac gia: " + tenTacGia_144);
        System.out.println("So ban phat hanh: " + soTrang_144);
    }

}
