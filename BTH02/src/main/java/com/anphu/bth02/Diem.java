/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth02;

/**
 *
 * @author phana
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
    public double getHoanhDo() {
        return this.hoanhDo;
    }
    
    public double getTungDo() {
        return this.tungDo;
    }
    
    public void hienThi() {
        System.out.printf("(%.1f,%.1f)", this.hoanhDo, this.tungDo);
    }
    
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) + Math.pow(this.tungDo - d.tungDo, 2));
    }
}
