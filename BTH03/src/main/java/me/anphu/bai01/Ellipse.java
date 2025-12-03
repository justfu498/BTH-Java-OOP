/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
class Ellipse {

    private double trucLon;
    private double trucNho;

    public Ellipse(double trucLon, double trucNho) {
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    public double tinhDienTich() {
        return Math.PI * this.trucLon * this.trucNho;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(trucLon, 2) + Math.pow(trucNho, 2)) / 2);
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.2f\nChu vi: %.2f",
                this.tinhDienTich(), this.tinhChuVi());
    }

    public double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    public double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }

}
