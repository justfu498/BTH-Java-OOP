/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public String toString() {
        return String.format("Hinh Chu Nhat\nDien tich: %.2f\nChu vi: %.2f\n",
                this.tinhDienTich(), this.tinhChuVi());
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

}
