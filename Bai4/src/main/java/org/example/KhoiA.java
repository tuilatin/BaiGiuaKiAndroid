package org.example;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1_144;
	private String mon2_144;
	private String mon3_144;

	public KhoiA() {}

	// ham khoi tao co doi so
	public KhoiA(String mon1_144, String mon2_144, String mon3_144) {
		this.mon1_144 = mon1_144;
		this.mon2_144 = mon2_144;
		this.mon3_144 = mon3_144;
	}

	// ham nhap
	public void nhap() {
		super.nhap();
		System.out.print("\tNhap mon 1: ");
		mon1_144 = sc_144.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_144 = sc_144.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_144 = sc_144.nextLine();
	}

	public void xuat() {
		super.xuat();
		System.out.println("\tTo hop mon thi: " + mon1_144 + " - " + mon2_144 + " - " + mon3_144);
	}
}
