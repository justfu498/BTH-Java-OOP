/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth02;

/**
 *
 * @author phana
 */
public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;
    
    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (trenTrai.getTungDo() >= duoiPhai.getTungDo() && trenTrai.getHoanhDo() <= duoiPhai.getHoanhDo()) {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else {
            throw new Exception("Invalid data!");
        }
    }

    public Diem getTrenTrai() {
        return trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
    
    public double tinhDai() {
        return duoiPhai.getHoanhDo() - trenTrai.getHoanhDo();
    }
    
    public double tinhRong() {
        return trenTrai.getTungDo() - duoiPhai.getTungDo();
    }
    
    public double tinhDienTich() {
        return tinhDai() * tinhRong();
    }
    
    public double tinhChuVi() {
        return (tinhDai() + tinhRong()) * 2;
    }
    
    public void hienThi() {
        System.out.print("Diem tren trai: ");
        trenTrai.hienThi();
        System.out.print("\nDiem duoi phai: ");
        duoiPhai.hienThi();
        System.out.println("\nChieu dai: " + tinhDai());
        System.out.println("Chieu rong: " + tinhRong());
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}
