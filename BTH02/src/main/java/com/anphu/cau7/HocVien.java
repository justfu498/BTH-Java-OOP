/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.cau7;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

/**
 *
 * @author phana
 */
public class HocVien {

    private static int dem;

    private int maHV = ++dem;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double[] diem;

    public HocVien() {
    }

    public HocVien(String hoTen, String queQuan, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh) {
        this(hoTen, queQuan, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));
    }

    public void nhapDiem() {
        diem = new double[CauHinh.SO_MON];
        for (int i = 0; i < CauHinh.SO_MON; i++) {
            System.out.printf("Diem mon %d: ", i + 1);
            diem[i] = Double.parseDouble(CauHinh.SC.nextLine());
        }
    }

    public void nhap() {
        System.out.print("Nhap ho ten: ");
        this.hoTen = CauHinh.SC.nextLine();
        System.out.print("Nhap que quan: ");
        this.queQuan = CauHinh.SC.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = LocalDate.parse(CauHinh.SC.nextLine(), CauHinh.FORMATTER);
    }

    public double tinhDiemTB() {
        if (diem != null) {
            return DoubleStream.of(diem).average().getAsDouble();
        }
        return 0;
    }

    public boolean hasHocBong() {
        if (diem != null) {
            for (var x : diem) {
                if (x <= 5) {
                    return false;
                }
            }
            return tinhDiemTB() >= 8;
        }
        return false;
    }

    public void hienThi() {
        System.out.println("===");
        System.out.printf("Ma HV: %d\nHo va ten: %s\nQue quan: %s\nNgay sinh: %s\n",
                maHV, hoTen, queQuan, ngaySinh.format(CauHinh.FORMATTER));
        if (diem != null) {
            System.out.print("Diem: ");
            for (int i = 0; i < CauHinh.SO_MON; i++) {
                System.out.printf("%.1f ", diem[i]);
            }
            System.out.printf("\nDiem trung binh: %.1f\n", tinhDiemTB());
        }
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int d) {
        dem = d;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }

}
