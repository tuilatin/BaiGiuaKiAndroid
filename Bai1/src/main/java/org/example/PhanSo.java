package org.example;
import java.util.Scanner;

class PhanSo {
    private int tuSo_144;
    private int mauSo_144;

    public PhanSo(){
        tuSo_144 = 0;
        mauSo_144 = 1;
    }

    public PhanSo(int tuSo_144, int mauSo_144) {
        this.tuSo_144 = tuSo_144;
        this.mauSo_144 = mauSo_144;
    }

    public PhanSo congPhanSo(PhanSo ps2) {
        int a_144;
        int b_144;
        a_144 = this.tuSo_144 * ps2.mauSo_144 + ps2.tuSo_144 * this.mauSo_144;
        b_144 = this.mauSo_144 * ps2.mauSo_144;
        return new PhanSo(a_144, b_144);
    }

    public PhanSo truPhanSo(PhanSo ps2) {
        int a_144;
        int b_144;
        a_144 = this.tuSo_144 * ps2.mauSo_144 - ps2.tuSo_144*this.mauSo_144;
        b_144 = this.mauSo_144 * ps2.mauSo_144;
        return new PhanSo(a_144, b_144);
    }

    public PhanSo nhanPhanSo(PhanSo ps2) {
        int a_144;
        int b_144;
        a_144 = this.tuSo_144 * ps2.tuSo_144;
        b_144 = this.mauSo_144 * ps2.mauSo_144;
        return new PhanSo(a_144, b_144);
    }

    public PhanSo chiaPhanSo(PhanSo ps2) {
        int a_144;
        int b_144;
        a_144 = this.tuSo_144 * ps2.mauSo_144;
        b_144 = this.mauSo_144 * ps2.tuSo_144;
        return new PhanSo(a_144, b_144);
    }

    public int timUCLN(){
        int a_144, b_144, r_144, temp;
        a_144 = this.tuSo_144;
        b_144 = this.mauSo_144;
        r_144 = a_144 % b_144;

        while(r_144 != 0){
            a_144 = b_144;
            b_144 = r_144;
            r_144 = a_144 % b_144;
        }
        return b_144;
    }

    public void kiemTraToiGian(){
        if (this.timUCLN() == 1)
            System.out.println("Phân số " + tuSo_144 + "/" + mauSo_144 + " tối giản");
        else
            System.out.println("Phân số " + tuSo_144 + "/" + mauSo_144 + " không tối giản");
    }

    public void timDangToiGian(){
        if (this.timUCLN() == 1)
            System.out.println("Phân số đã tối giản");
        else {
            int tuToiGian_144 = this.tuSo_144 / this.timUCLN();
            int mauToiGian_144 = this.mauSo_144 / this.timUCLN();
            System.out.println("Dạng tối giản của " + this.xuat() + " là " + tuToiGian_144 + "/" + mauToiGian_144 );
        }
    }

    public void rutGonPhanSo(){
        tuSo_144 = tuSo_144 / this.timUCLN();
        mauSo_144 = mauSo_144 / this.timUCLN();
    }

    public String xuat(){
        if(mauSo_144 == 1)
            return tuSo_144 + "";
        return tuSo_144 + "/" + mauSo_144;
    }

    public String xuatToiGian(){
        int a_144 = tuSo_144 / this.timUCLN();
        int b_144 = mauSo_144 / this.timUCLN();
        if(b_144 == 1)
            return a_144 + "";
        return a_144 + "/" + b_144;
    }
}

