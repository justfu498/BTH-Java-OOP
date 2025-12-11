/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai05;

/**
 *
 * @author phana
 */
abstract class NhanVien {

    private static int dem;

    private int id = ++dem;
    private String cccd;
    private String hoTen;
    private String queQuan;

    public NhanVien(String cccd, String hoTen, String queQuan) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public abstract double getHeSo();

    public double tinhLuong(int soNgayCong) {
        return getHeSo() * 100000 * soNgayCong;
    }

    public void hienThi() {
        System.out.printf("Ho ten: %s\nCCCD: %s\nQue quan: %s\n",
                this.hoTen, this.cccd, this.queQuan);
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

}
