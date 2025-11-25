/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
class TamGiac extends Hinh {

    private double a, b, c;

    public TamGiac(String ten, double a, double b, double c) throws Exception {
        super(ten);
        if (a < b + c && b < a + c && c < a + b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new Exception("Tam giac khong hop le!");
        }
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TamGiac t) {
            return this.hashCode() == t.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.c) ^ (Double.doubleToLongBits(this.c) >>> 32));
        return hash;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}
