package me.anphu.bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class GiangVien {

    protected static final double LUONG_MOT_GIO = 90000;

    private String hoTen;
    private LocalDate ngayTG;
    private double gioLam;

    public GiangVien(String hoTen, String ngayTG, double gioLam) {
        this.hoTen = hoTen;
        this.ngayTG = LocalDate.parse(ngayTG, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.gioLam = gioLam;
    }

    @Override
    public String toString() {
        return String.format("Ho ten: %s\nNgay TG: %s\nGio lam: %.1f\n",
                this.hoTen, this.ngayTG.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), this.gioLam);
    }

    public abstract double tinhLuong();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayTG() {
        return ngayTG;
    }

    public void setNgayTG(LocalDate ngayTG) {
        this.ngayTG = ngayTG;
    }

    public double getGioLam() {
        return gioLam;
    }

    public void setGioLam(double gioLam) {
        this.gioLam = gioLam;
    }

}
