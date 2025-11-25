/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

import java.util.Objects;

/**
 *
 * @author phana
 */
abstract class Hinh implements Cloneable {

    private String ten;

    public Hinh(String ten) {
        this.ten = ten;
    }

    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f\n",
                this.ten, this.tinhDienTich(), this.tinhChuVi());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hinh h) {
            return this.hashCode() == h.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ten);
        return hash;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
