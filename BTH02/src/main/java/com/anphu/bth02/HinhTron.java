/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth02;

/**
 *
 * @author phana
 */
public class HinhTron {
    private Diem tam;
    private double banKinh;
    
    public HinhTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public Diem getTam() {
        return tam;
    }

    public void setTam(Diem tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }
    
    public double tinhChuVi() {
        return banKinh * 2 * Math.PI;
    }
    
    /**
     * 
     * @param d
     * @return =0 - diem nam tren duong tron, >0 - diem nam ngoai hinh tron, <0 - diem nam trong hinh tron
     */
    public int xetViTriTuongDoi(Diem d) {
        return Double.compare(this.tam.tinhKhoangCach(d), banKinh);
    }
}
