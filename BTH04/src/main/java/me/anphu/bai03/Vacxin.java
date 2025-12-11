/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

/**
 *
 * @author phana
 */
class Vacxin {

    private static int dem;

    private int ma = ++dem;
    private String ten;
    private String xuatXu;
    private int soLuong;

    public Vacxin(String ten, String xuatXu, int soLuong) {
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nTen: %s\nXuat xu: %s\nSo luong: %d\n",
                this.ma, this.ten, this.xuatXu, this.soLuong);
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
