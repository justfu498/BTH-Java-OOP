/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.cau7;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author phana
 */
public class Tester {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        HocVien h1 = new HocVien("Nguyen Van A", "Dong Thap", "24/10/2006");
//        HocVien h2 = new HocVien("Nguyen Van B", "Ha Tinh", "10/06/2010");
//        HocVien h3 = new HocVien("Nguyen Van C", "TPHCM", LocalDate.of(2007, Month.MARCH, 7));
//        h1.hienThi();
//        h2.hienThi();
//        h3.hienThi();
        QuanLyHocVien ql = new QuanLyHocVien();
        System.out.println("===KET QUA DOC FILE===");
        ql.docFile("src/main/resources/hv.txt");
        ql.hienThi();
        System.out.println("So luong < 18 tuoi: " + ql.demNhoHon(18));
        System.out.println("So luong 18 <= tuoi <= 23: " + ql.demKhoang(18, 23));
        System.out.println("So luong >= 19 tuoi: " + ql.demTuNTroLen(19));
//        ql.nhapDiem();
//        System.out.println("===KET QUA NHAP DIEM===");
//        ql.hienThi();
//        ql.sapXep();
//        System.out.println("===KET QUA SAP XEP===");
//        ql.hienThi();
//        System.out.println("===KET QUA HOC BONG===");
//        ql.timKiem().forEach(h -> h.hienThi());
//        ql.xuatHocBong("src/main/resources/hocbong.txt");
    }
}
