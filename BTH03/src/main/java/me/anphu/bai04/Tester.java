/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

/**
 *
 * @author phana
 */
class Tester {

    public static void main(String[] args) {
        TaiKhoan t1 = new TKKoKyHan("Phan An Phu", 50000);
        TaiKhoan t2 = new TKCoKyHan("Le Tan Tai", 100000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TKCoKyHan("Nhan to P", 500000, KyHan.MOT_THANG);
        QLTK ql = new QLTK();
        ql.them(t1, t2, t3);
        ql.hienThi();
        System.out.println("===");
        ql.timKiem("P").forEach(x -> x.hienThi());
        System.out.println("===");
        ql.timKiem("000001").forEach(x -> x.hienThi());
//        System.out.println("===");
//        t1.napTien(100000);
//        t2.napTien(500000);
//        ql.hienThi();
//        System.out.println("===");
//        t1.rutTien(20000);
//        t2.rutTien(50000);
//        ql.hienThi();
        System.out.println("===");
        ql.hienThiLs();
    }
}
