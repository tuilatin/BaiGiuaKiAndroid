package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen_144;
    protected Date ngaySinh_144;
    protected String queQuan_144;
    Scanner sc_144 = new Scanner(System.in);

    public Nguoi() {}

    public Nguoi(String hoTen_144, Date ngaySinh_144, String queQuan_144) {
        this.hoTen_144 = hoTen_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.queQuan_144 = queQuan_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap ho ten: ");
        hoTen_144 = sc_144.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        String strDate_144 = sc_144.nextLine();
        ngaySinh_144 = strToDate_144(strDate_144);

        System.out.print("\tNhap que quan: ");
        queQuan_144 = sc_144.nextLine();
    }

    private Date strToDate_144(String strDate_144) {
        Date date_144 = null;
        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date_144 = sdf_144.parse(strDate_144);
        } catch (ParseException e_144) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date_144;
    }

    public void hienThiThongTin() {
        SimpleDateFormat sdf_144 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("\tHo ten: " + hoTen_144);
        System.out.println("\tNgay sinh: " + sdf_144.format(ngaySinh_144));
        System.out.println("\tQue quan: " + queQuan_144);
    }

    public String getQueQuan() {
        return queQuan_144;
    }

    public Date getNgaySinh() {
        return ngaySinh_144;
    }

}
