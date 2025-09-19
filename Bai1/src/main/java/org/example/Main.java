package org.example;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1_144 = new PhanSo(1, 2);
        PhanSo ps2_144 = new PhanSo(2, 4);
        System.out.println("Phân số 1: " + ps1_144.xuat());
        System.out.println("Phân số 2: " + ps2_144.xuat());
        PhanSo psTong_144;
        psTong_144 = ps1_144.congPhanSo(ps2_144);
        System.out.println("Tổng " + ps1_144.xuat() + " + " + ps2_144.xuat() + " = " + psTong_144.xuatToiGian());
        psTong_144 = ps1_144.truPhanSo(ps2_144);
        System.out.println("Hiệu " + ps1_144.xuat() + " - " + ps2_144.xuat() + " = " + psTong_144.xuatToiGian());
        psTong_144 = ps1_144.nhanPhanSo(ps2_144);
        System.out.println("Tích " + ps1_144.xuat() + " * " + ps2_144.xuat() + " = " + psTong_144.xuatToiGian());
        psTong_144 = ps1_144.chiaPhanSo(ps2_144);
        System.out.println("Thương " + ps1_144.xuat() + " / " + ps2_144.xuat() + " = " + psTong_144.xuatToiGian());

        ps2_144.kiemTraToiGian();
        ps2_144.timDangToiGian();

        System.out.println("Ước chung lớn nhất của " + ps2_144.xuat() + " là " + ps2_144.timUCLN());
    }
}
