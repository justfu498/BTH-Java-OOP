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

    public static void main(String[] args) throws Exception {
        Vacxin v1 = new Vacxin("AstraZeneca", "Anh", 100);
        Vacxin v2 = new Vacxin("Sputnik-V", "Nga", 120);
        Vacxin v3 = new Vacxin("Pfizer", "My", 110);
        Vacxin v4 = new Vacxin("Vero Cell", "Trung Quoc", 140);
        QLVacxin qlVacxin = new QLVacxin();
        qlVacxin.them(v1, v2, v3, v4);
        qlVacxin.hienThi();
        qlVacxin.sapXep();
        qlVacxin.hienThi();

        QLNguoi qlNguoi = new QLNguoi();

        Nguoi n1, n2, n3, n4;
        n1 = new NguoiDan("Nguyen Van A", "Nam", "28/02/2006", "123456789");
        n2 = new NguoiDan("Phan Thi B", "Nu", "14/01/2004", "234567891");
        n3 = new NguoiNuocNgoai("Lionel Messi", "Nam", "25/06/1980", "Argentina");
        n4 = new NguoiNuocNgoai("Eimi Fukada", "Nu", "10/10/1996", "Nhat Ban");
        qlNguoi.them(n1, n2, n3, n4);
        qlNguoi.hienThi();

        System.out.println("===DS NGUOI NUOC NGOAI THAM GIA TIEM CHUNG===");
        try {
            qlNguoi.timKiem("me.anphu.bai03.NguoiNuocNgoai").forEach(x -> System.out.println(x));
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong tim thay lop!");
        }

        MuiTiem m1 = new MuiTiem(n1, v1, "01/12/2025");
        MuiTiem m2 = new MuiTiem(n1, v2, "05/03/2026");
        MuiTiem m3 = new MuiTiem(n1, v3, "20/06/2026");
        n1.themMuiTiem(m1);
        n1.themMuiTiem(m2);
        n1.themMuiTiem(m3);

        MuiTiem n2m1 = (MuiTiem) m1.clone();
        n2m1.setNguoi(n2);
        n2.themMuiTiem(n2m1);

        MuiTiem n3m1 = (MuiTiem) m1.clone();
        n3m1.setNguoi(n3);
        MuiTiem n3m2 = (MuiTiem) m2.clone();
        n3m2.setNguoi(n3);
        n3.themMuiTiem(n3m1);
        n3.themMuiTiem(n3m2);
        qlNguoi.hienThi();
    }
}
