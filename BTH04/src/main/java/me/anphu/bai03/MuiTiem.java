/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

import java.time.LocalDate;

/**
 *
 * @author phana
 */
class MuiTiem implements Cloneable {

    private Nguoi nguoi;
    private Vacxin loaiVacxin;
    private LocalDate ngayTiem;

    public MuiTiem(Nguoi nguoi, Vacxin loaiVacxin, LocalDate ngayTiem) {
        this.nguoi = nguoi;
        this.loaiVacxin = loaiVacxin;
        this.ngayTiem = ngayTiem;
    }

    public MuiTiem(Nguoi nguoi, Vacxin loaiVacxin, String ngayTiem) {
        this(nguoi, loaiVacxin, LocalDate.parse(ngayTiem, CauHinh.DATE_FORMAT));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public boolean isDuDK(MuiTiem x) {
        return this.ngayTiem.plusMonths(3).isBefore(x.ngayTiem);
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public Vacxin getLoaiVacxin() {
        return loaiVacxin;
    }

    public void setLoaiVacxin(Vacxin loaiVacxin) {
        this.loaiVacxin = loaiVacxin;
    }

    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

}
