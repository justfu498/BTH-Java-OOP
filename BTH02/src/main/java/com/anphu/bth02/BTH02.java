/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.anphu.bth02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phana
 */
public class BTH02 {

    public static void main(String[] args) throws Exception {
//        Diem d1 = new Diem(5, 2);
//        Diem d2 = new Diem(3, 7);
//        d1.hienThi();
//        d2.hienThi();
//        System.out.printf("\nKhoang cach: %.1f\n", d1.tinhKhoangCach(d2));
//        System.out.println("=============");
//        
//        DoanThang dt1 = new DoanThang(d1, d2);
//        dt1.hienThi();
//        System.out.printf("\nDo dai: %.1f\n", dt1.tinhDoDai());
//        System.out.print("Trung diem: ");
//        dt1.timTrungDiem().hienThi();
//        System.out.println("\n============");
//        
//        DoanThang dd1 = new DoanThang(new Diem(1, 0), new Diem(0, 1));
//        DoanThang dd2 = new DoanThang(new Diem(2, 0), new Diem(0, 2));
//        System.out.println(dd1.isSongSong(dd2));
//        System.out.println("============");
//        
//        HinhChuNhat h = new HinhChuNhat(new Diem(1, 3), new Diem(4, 1));
//        h.hienThi();
//        System.out.println("============");
//        
//        HinhTron ht = new HinhTron(new Diem(2, 3), 2);
//        System.out.printf("Dien tich: %.1f\n", ht.tinhDienTich());
//        System.out.printf("Chu vi: %.1f\n", ht.tinhChuVi());
//        Diem x = new Diem(4, 5);
//        System.out.println("Vi tri tuong doi: " + ht.xetViTriTuongDoi(x));
        PhanSo p1 = new PhanSo(12, 10);
        PhanSo p2 = new PhanSo(7, 14);
        PhanSo p3 = new PhanSo(6, 8);
//        System.out.print("Cho 2 phan so ");
//        p1.hienThi();
//        System.out.print(", ");
//        p2.hienThi();
//        System.out.print("\nTong = ");
//        PhanSo res = p1.cong(p2);
//        res.hienThi();
//        
//        System.out.print("\nHieu = ");
//        res = p1.tru(p2);
//        res.hienThi();
//        
//        System.out.print("\nTich = ");
//        res = p1.nhan(p2);
//        res.hienThi();
//        
//        System.out.print("\nThuong = ");
//        res = p1.chia(p2);
//        res.hienThi();
//        
//        System.out.println("\nSo sanh: " + p1.soSanh(p2));
        List<PhanSo> dsPhanSo = new ArrayList<>();
        dsPhanSo.add(p1);
        dsPhanSo.add(p2);
        dsPhanSo.add(p3);
        for (var x : dsPhanSo) {
            x.hienThi();
            System.out.print(" ");
        }
        System.out.println("");
        PhanSo res = new PhanSo();
        for (var x : dsPhanSo) {
            res = res.cong(x);
        }
        System.out.print("Tong = ");
        res.hienThi();
        
        PhanSo max = new PhanSo();
        for (var x : dsPhanSo) {
            if (max.tinhGT() < x.tinhGT()) {
                max = x;
            }
        }
        System.out.print("\nPhan so lon nhat: ");
        max.hienThi();
    }
}
