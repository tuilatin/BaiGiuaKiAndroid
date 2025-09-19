package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThiSinh {
	private ArrayList<ThiSinh> dsts_144;
	public static Scanner sc_144 = new Scanner(System.in);

	public QuanLyThiSinh() {
		dsts_144 = new ArrayList<ThiSinh>();
	}

	public void themThiSinh(ThiSinh ts_144) {
		dsts_144.add(ts_144);
	}

	public void nhapDanhSach() {
		ThiSinh ts_144;
		int chon_144;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n_144 = sc_144.nextInt();
		sc_144.nextLine();

		for (int i_144 = 0; i_144 < n_144; i_144++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon_144 = sc_144.nextInt();
			switch (chon_144) {
				case 1:
					ts_144 = new KhoiA("Toan", "Ly", "Hoa");
					break;
				case 2:
					ts_144 = new KhoiB("Toan", "Hoa", "Sinh");
					break;
				case 3:
					ts_144 = new KhoiC("Van", "Su", "Dia");
					break;
				default:
					ts_144 = new KhoiA("Toan", "Ly", "Hoa");
					break;
			}
			ts_144.nhap();
			themThiSinh(ts_144);
		}
	}

	public void hienThiDanhSach() {
		int n = dsts_144.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts_144.get(i).xuat();
		}
	}

	public void timKiemThiSinh(int soBaoDanh_144) {
		for (ThiSinh ts_144 : dsts_144) {
			if (ts_144.getSoBD() == soBaoDanh_144) {
				ts_144.xuat();
			}
		}
	}

}
