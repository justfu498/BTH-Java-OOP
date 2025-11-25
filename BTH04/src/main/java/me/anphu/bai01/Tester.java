/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
public class Tester {

    public static void main(String[] args) throws CloneNotSupportedException {

        QLHinh ql = new QLHinh();
        Hinh h1 = new HinhChuNhat("HCN1", 3, 4);
        Hinh h2 = new HinhChuNhat("HCN2", 4, 5);
        Hinh h3 = new HinhVuong("HCN1", 5);
        Hinh h4 = new HinhVuong("HV2", 3);
        ql.them(h1, h2, h3, h4);
        try {
            Hinh h5 = new TamGiac("TG1", 2, 4, 3);
            ql.them(h5);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Hinh h6 = new TamGiacCan("TG2", 3, 4);
            ql.them(h6);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ql.hienThi();

        System.out.println("===");
        ql.xoa("HCN2");
        ql.hienThi();

        System.out.println("===");
        try {
            ql.timKiem("me.anphu.bai01.TamGiac").forEach(x -> System.out.println(x));
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("===");
        ql.sapXep2();
        ql.hienThi();

        System.out.println("===");
        System.out.printf("Dien tich trung binh = %.1f\n", ql.tinhDTTB());

        System.out.println("===");
        Hinh x = (Hinh) h4.clone();
        System.out.println(ql.timHinh(x));
    }
}
