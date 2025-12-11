/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai05;

/**
 *
 * @author phana
 */
class NhanVienD extends NhanVien {

    private double phuCap;

    public NhanVienD(String cccd, String hoTen, String queQuan, double phuCap) {
        super(cccd, hoTen, queQuan);
        this.phuCap = phuCap;
    }

    @Override
    public double getHeSo() {
        return 1;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return super.tinhLuong(soNgayCong) + this.phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

}
