package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon_144;
    private Date ngayMuon_144;
    private Date hanTra_144;
    private String soHieu_144;

    public TheMuon() {

    }

    public TheMuon(int soMuon_144, Date ngayMuon_144, String soHieu_144) {
        this.soMuon_144 = soMuon_144;
        this.ngayMuon_144 = ngayMuon_144;
        this.soHieu_144 = soHieu_144;
    }

    public void nhapThongTin() {
        super.nhapThongTin();

        System.out.print("\tNhap so muon: ");
        soMuon_144 = sc_144.nextInt();
        sc_144.nextLine();

        System.out.print("\tNhap ngay muon (dd-MM-yyyy): ");
        String strNgayMuon_144 = sc_144.nextLine();
        ngayMuon_144 = strToDate(strNgayMuon_144);

        System.out.print("\tNhap ngay tra (dd-MM-yyyy): ");
        String strNgayTra_144 = sc_144.nextLine();
        hanTra_144 = strToDate(strNgayTra_144);

        System.out.print("\tNhap so hieu: ");
        soHieu_144 = sc_144.nextLine();
    }

    private Date strToDate(String strNgayMuon_144) {
        Date date_144 = null;
        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_144 = sdf_144.parse(strNgayMuon_144);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date_144;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("\tSo phieu muon: " + soMuon_144);
        System.out.println("\tNgay muon: " + sdf_144.format(ngayMuon_144));
        System.out.println("\tHan tra: " + sdf_144.format(hanTra_144));
        System.out.println("\tSo hieu: " + soHieu_144);
    }

    public Date getHanTra_144() {
        return hanTra_144;
    }
}
