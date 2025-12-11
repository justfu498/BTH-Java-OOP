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
class NguoiDan extends Nguoi {

    private String soCanCuoc;

    public NguoiDan(String hoTen, String gioiTinh, LocalDate ngaySinh, String soCanCuoc, MuiTiem... mt) throws Exception {
        super(hoTen, gioiTinh, ngaySinh, mt);
        this.soCanCuoc = soCanCuoc;
    }

    public NguoiDan(String hoTen, String gioiTinh, String ngaySinh, String soCanCuoc, MuiTiem... mt) throws Exception {
        this(
                hoTen,
                gioiTinh,
                LocalDate.parse(ngaySinh, CauHinh.DATE_FORMAT),
                soCanCuoc,
                mt
        );
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("So can cuoc: %s\n", this.soCanCuoc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getSoCanCuoc() {
        return soCanCuoc;
    }

    public void setSoCanCuoc(String soCanCuoc) {
        this.soCanCuoc = soCanCuoc;
    }

}
