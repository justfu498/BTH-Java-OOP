/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

/**
 *
 * @author phana
 */
abstract class TaiKhoan {

    private static int dem;

    private String soTK;
    private String tenTK;
    private double soTien;

    {
        this.soTK = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTK, double soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public void hienThi() {
        System.out.printf("So TK: %s\nTen TK: %s\nSo tien: %.2f\n",
                this.soTK, this.tenTK, this.soTien);
    }

    public abstract boolean isDaoHan();

    public void napTien(double soTien) {
        if (isDaoHan()) {
            this.soTien += soTien;
        }
    }

    public void rutTien(double soTien) {
        if (isDaoHan() && this.soTien >= soTien) {
            this.soTien -= soTien;
        }
    }

    public abstract double tinhLai();

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

}
