package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // thuoc tinh
    private String hoTen_144;
    private Date ngaySinh_144;
    private String ngheNghiep_144;
    public static Scanner sc_144 = new Scanner(System.in);

    public Nguoi() {}

    // ham khoi tao co doi so
    public Nguoi(String hoTen_144, Date ngaySinh_144, String ngheNghiep_144) {
        this.hoTen_144 = hoTen_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.ngheNghiep_144 = ngheNghiep_144;
    }

    // nhap cac thong tung nguoi trong ho gia dinh
    public void nhapThongTin() {
        System.out.print("\tNhap ho ten: ");
        hoTen_144 = sc_144.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate = sc_144.nextLine();
        ngaySinh_144 = strToDate(strDate);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep_144 = sc_144.nextLine();
    }

    // ham thuc hien chuyen string sang date
    private Date strToDate(String strDate_144) {
        Date date_144 = null;

        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_144 = sdf_144.parse(strDate_144);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date_144;
    }

    // hien thi ra tung nguoi
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_144);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh_144));
        System.out.println("\tNghe nghiep: " + ngheNghiep_144);
    }

    // ham chuyen dinh dang tu date sang String
    private String dateToString(Date date_144) {
        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");

        String strDate_144 = sdf_144.format(date_144);

        return strDate_144;
    }

    // ham lay thong tin ve ngay sinh
    public Date getNgaySinh() {
        return ngaySinh_144;
    }
}
