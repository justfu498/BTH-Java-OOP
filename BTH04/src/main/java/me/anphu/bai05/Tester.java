/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai05;

/**
 *
 * @author phana
 */
class Tester {

    public static void main(String[] args) {
        QLNhanVien ql = new QLNhanVien();
        NhanVien n1 = new NhanVienA("123456789", "Phan An Phu", "Dong Thap");
        NhanVien n2 = new NhanVienB("987654321", "Thai Vinh Nguyen", "Quang Tri");
        NhanVien n3 = new NhanVienB("918273465", "Nguyen Phan Thien Phuoc", "TP.HCM");
        NhanVien n4 = new NhanVienC("192837645", "Le Tan Tai", "TP.HCM");
        NhanVien n5 = new NhanVienD("145698732", "Vu Thanh Tai", "Dong Nai", 1000000);
        System.out.println("===Them");
        ql.them(n1, n2, n3, n4, n5);
        ql.hienThi();
        System.out.println("===Xoa");
        ql.xoa(n3);
        ql.hienThi();
        System.out.println("===Tim kiem");
        System.out.println("===Tinh Luong");
        System.out.println(n1.tinhLuong(27));
        System.out.println(n2.tinhLuong(20));
        System.out.println(n4.tinhLuong(22));
        System.out.println(n5.tinhLuong(27));
    }
}
