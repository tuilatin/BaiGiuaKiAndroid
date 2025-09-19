package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen_144;
    protected Date ngaySinh_144;
    protected int CMND_144;
    public Scanner sc_144 = new Scanner(System.in);

    public Nguoi() {}

    public Nguoi(String hoTen_144, Date ngaySinh_144, int CMND_144) {
        this.hoTen_144 = hoTen_144;
        this.ngaySinh_144 = ngaySinh_144;
        this.CMND_144 = CMND_144;
    }

    public void nhapThongTin() {
        System.out.print("\tNhap ho ten: ");
        hoTen_144 = sc_144.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_144 = sc_144.nextLine();
        ngaySinh_144 = strToDate(strDate_144);
        System.out.print("\tNhap CMND: ");
        CMND_144 = sc_144.nextInt();
        sc_144.nextLine(); // clear buffer
    }

    private Date strToDate(String strDate_144) {
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
        System.out.println("\tHo ten: " + hoTen_144);
        System.out.println("\tNgay sinh: " + ngaySinh_144);
        System.out.println("\tCMND: " + CMND_144);
    }

    public int getCMND() {
        return CMND_144;
    }
}
