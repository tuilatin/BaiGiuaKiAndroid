package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    List<CanBo> listCanBo_144;

    public QLCB() {
        listCanBo_144 = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo_144) {
        listCanBo_144.add(canBo_144);
    }

    public void nhapDanhSach(Scanner sc_144) {
        CanBo canBo_144;
        System.out.println("Nhap so luong can bo: ");
        int n = sc_144.nextInt(); sc_144.nextLine();

        System.out.println("Nhap thong tin chi tiet: ");
        for(int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i+1) + ": ");
            System.out.println("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
            int chon_144 = sc_144.nextInt();
            sc_144.nextLine();
            canBo_144 = new CanBo();

            switch (chon_144) {
                case 1:
                    canBo_144 = new KySu();
                    break;
                case 2:
                    canBo_144 = new NhanVien();
                    break;
                case 3:
                    canBo_144 = new CongNhan();
                    break;
                default:
                    break;
            }

            canBo_144.nhapThongTin(sc_144);
            themCanBo(canBo_144);
        }
    }

    public void timKiemCanBo(String hoTen_144){
        for(CanBo canBo_144 : listCanBo_144) {
            if(hoTen_144.equals(canBo_144.getHoTen_144())) {
                canBo_144.hienThiThongTin();
            }
        }
    }
}
