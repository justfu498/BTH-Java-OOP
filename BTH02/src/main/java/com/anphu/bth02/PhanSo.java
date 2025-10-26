/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth02;

/**
 *
 * @author phana
 */
public class PhanSo {
    private int tu;
    private int mau;
    private static int dem;
    
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }
    
    public PhanSo(int tu, int mau) throws Exception {
        if (mau != 0) {
            this.tu = tu;
            this.mau = mau;
        } else {
            throw new Exception("Mau so phai khac 0");
        }
    }
    
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getTu() {
        return tu;
    }
    
    public void setMau(int mau) {
        this.mau = mau;
    }
    public int getMau() {
        return mau;
    }
    
    public void hienThi() {
        System.out.printf("%d/%d", this.tu, this.mau);
    }
    
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            a = a % b;
            int c = a;
            a = b;
            b = c;
        }
        return a;
    }
    
    public PhanSo rutGon() {
        PhanSo res = new PhanSo();
        int ucln = timUCLN(this.tu, this.mau);
        res.setTu(this.tu / ucln);
        res.setMau(this.mau / ucln);
        return res;
    }
    
    public PhanSo cong(PhanSo p) {
        PhanSo res = new PhanSo();
        res.setTu(this.tu * p.mau + p.tu * this.mau);
        res.setMau(this.mau * p.mau);
        return res.rutGon();
    }
    
    public PhanSo tru(PhanSo p) {
        PhanSo res = new PhanSo();
        res.setTu(this.tu * p.mau - p.tu * this.mau);
        res.setMau(this.mau * p.mau);
        return res.rutGon();
    }
    
    public PhanSo nhan(PhanSo p) {
        PhanSo res = new PhanSo();
        res.setTu(this.tu * p.tu);
        res.setMau(this.mau * p.mau);
        return res.rutGon();
    }
    
    public PhanSo chia(PhanSo p) {
        PhanSo res = new PhanSo();
        res.setTu(this.tu * p.mau);
        res.setMau(this.mau * p.tu);
        return res.rutGon();
    }
    
    public double tinhGT() {
        return this.tu * 1.0 / this.mau;
    }
    
    public int soSanh(PhanSo p) {
        return Double.compare(this.tinhGT(), p.tinhGT());
    }
}
