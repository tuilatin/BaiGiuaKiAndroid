package org.example;

import java.util.Scanner;

public class ThiSinh {
	private int soBD_144;
	private String hoTen_144;
	private String diaChi_144;
	private String dienUuTien_144;
	public static Scanner sc_144 = new Scanner(System.in);

	public ThiSinh() {}

	public ThiSinh(int soBD_144, String hoTen_144, String diaChi_144, String dienUuTien_144) {
		this.soBD_144 = soBD_144;
		this.hoTen_144 = hoTen_144;
		this.diaChi_144 = diaChi_144;
		this.dienUuTien_144 = dienUuTien_144;
	}

	public void nhap() {
		System.out.print("Nhap so bao danh: ");
		soBD_144 = sc_144.nextInt();
		sc_144.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen_144 = sc_144.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi_144 = sc_144.nextLine();
		System.out.print("Nhap dien uu tien: ");
		dienUuTien_144 = sc_144.nextLine();
	}

	public void xuat() {
		System.out.println("So bao danh: " + soBD_144);
		System.out.println("Ho ten: " + hoTen_144);
		System.out.println("Dia chi: " + diaChi_144);
		System.out.println("Dien uu tien: " + dienUuTien_144);
	}

	public int getSoBD() {
		return soBD_144;
	}
}
