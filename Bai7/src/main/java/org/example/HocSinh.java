package org.example;

public class HocSinh extends Nguoi {
    private String lop_144;
    private String khoHoc_144;
    private String kyHoc_144;

    public HocSinh() {}

    public HocSinh(String hoTen_144, String lop_144, String khoHoc_144, String kyHoc_144) {
        this.hoTen_144 = hoTen_144;
        this.lop_144 = lop_144;
        this.khoHoc_144 = khoHoc_144;
        this.kyHoc_144 = kyHoc_144;
    }

    public void nhapThongTin() {
        super.nhapThongTin();

        System.out.print("\tNhap lop: ");
        lop_144 = sc_144.nextLine();

        System.out.print("\tNhap khoa hoc: ");
        khoHoc_144 = sc_144.nextLine();

        System.out.print("\tNhap ky hoc: ");
        kyHoc_144 = sc_144.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLop: " + lop_144);
        System.out.println("\tKhoa hoc: " + khoHoc_144);
        System.out.println("\tKy hoc: " + kyHoc_144);
    }

    public String getLop() {
        return lop_144;
    }
}
