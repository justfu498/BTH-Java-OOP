/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
class Ellipse extends Hinh {

    private double trucLon;
    private double trucNho;

    public Ellipse(String ten, double trucLon, double trucNho) {
        super(ten);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.trucLon * this.trucNho;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt(Math.pow(trucLon, 2) + Math.pow(trucNho, 2) / 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ellipse e) {
            return this.hashCode() == e.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.trucLon) ^ (Double.doubleToLongBits(this.trucLon) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.trucNho) ^ (Double.doubleToLongBits(this.trucNho) >>> 32));
        return hash;
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
