/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class Tester {

    public static void main(String[] args) {
        GiangVien gv1 = new GVCoHuu("Phan An Phu", "26/11/2025", 64, 2340000, 1);
        GiangVien gv2 = new GVThinhGiang("Nguyen Phan Thien Phuoc", "25/11/2025", 80, "Nha Be");
        GiangVien gv3 = new GVCoHuu("Le Tan Tai", "20/10/1990", 72, 2340000, 8);

        QLGV ql = new QLGV();
        ql.them(gv1, gv2, gv3);
        ql.hienThi();
        System.out.println("===");
        ql.sapXep();
        ql.hienThi();
    }
}
