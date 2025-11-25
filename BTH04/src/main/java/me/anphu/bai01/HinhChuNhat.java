/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
class HinhChuNhat extends Hinh {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HinhChuNhat h) {
            return this.hashCode() == h.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.chieuDai) ^ (Double.doubleToLongBits(this.chieuDai) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.chieuRong) ^ (Double.doubleToLongBits(this.chieuRong) >>> 32));
        return hash;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (this.chieuDai + this.chieuDai) * 2;
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
