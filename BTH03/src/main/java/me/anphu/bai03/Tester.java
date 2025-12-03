/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

/**
 *
 * @author phana
 */
class Tester {

    public static void main(String[] args) {
        QLSP ql = new QLSP();
        SanPham s1 = new Sach("Sach Tieng Anh", 50, 200);
        SanPham s2 = new Sach("Sach Tieng Viet", 35, 250);
        SanPham s3 = new BangDia("CD for English Book", 40, 300);
        SanPham s4 = new BangDia("Phim Tai Lieu Lich Su", 30, 500);
        ql.them(s1, s2, s3, s4);
        ql.hienThi();

//        System.out.println("===");
//        ql.xoa(s3);
//        ql.hienThi();
        System.out.println("===");
        System.out.println(ql.timKiem(3));

        System.out.println("===");
        ql.timKiem("Tieng").forEach(x -> System.out.println(x));

        System.out.println("===");
        ql.timKiem("me.anphu.bai03.BangDia").forEach(x -> System.out.println(x));

        System.out.println("===");
        ql.timKiem(30, 45).forEach(x -> System.out.println(x));

        System.out.println("===");
        ql.sapXep();
        ql.hienThi();
    }
}
