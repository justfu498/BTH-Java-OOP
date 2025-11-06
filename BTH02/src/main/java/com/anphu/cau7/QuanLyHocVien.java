/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.cau7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author phana
 */
public class QuanLyHocVien {

    private List<HocVien> ds = new ArrayList<>();

    public void themHV(HocVien... hv) {
        this.ds.addAll(Arrays.asList(hv));
    }

    public void themHV() {
        System.out.print("Nhap so luong can them: ");
        int n = Integer.parseInt(CauHinh.SC.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap hoc vien thu %d:\n", i + 1);
            HocVien hv = new HocVien();
            hv.nhap();
            ds.add(hv);
        }
    }

    public void docFile(String file) throws FileNotFoundException {
        File f = new File(file);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public void nhapDiem() {
        this.ds.forEach(h -> {
            System.out.printf("Nhap diem cho %s:\n", h.getHoTen());
            h.nhapDiem();
        });
    }

    public HocVien timKiem(int maHV) {
        return this.ds.stream().filter(h -> h.getMaHV() == maHV).findFirst().orElse(null);
    }

    public List<HocVien> timKiem(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getHoTen().contains(tuKhoa)).collect(Collectors.toList());
    }

    public List<HocVien> timKiem() {
        return this.ds.stream().filter(h -> h.hasHocBong()).collect(Collectors.toList());
    }

    public void xuatHocBong(String file) throws IOException {
        List<HocVien> dsHocBong = timKiem();
        File f = new File(file);
        FileWriter fw = new FileWriter(f, true);
        try (PrintWriter pw = new PrintWriter(fw)) {
            for (var x : dsHocBong) {
                pw.printf("%d\n%s\n%.1f\n", x.getMaHV(), x.getHoTen(), x.tinhDiemTB());
            }
        }
    }

    public void sapXep() {
        this.ds.sort((a, b) -> Double.compare(a.tinhDiemTB(), b.tinhDiemTB()));
    }

    public long demNhoHon(int n) {
        return this.ds.stream().filter(h -> LocalDate.now().getYear() - h.getNgaySinh().getYear() < n).count();
    }

    public long demKhoang(int dau, int cuoi) {
        return this.ds.stream().filter(h
                -> LocalDate.now().getYear() - h.getNgaySinh().getYear() >= dau
                && LocalDate.now().getYear() - h.getNgaySinh().getYear() <= cuoi)
                .count();
    }

    public long demTuNTroLen(int n) {
        return this.ds.stream().filter(h -> LocalDate.now().getYear() - h.getNgaySinh().getYear() >= n).count();
    }

    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }
}
