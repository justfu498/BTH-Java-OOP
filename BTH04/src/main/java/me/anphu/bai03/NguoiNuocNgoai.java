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
class NguoiNuocNgoai extends Nguoi {

    private String quocTich;

    public NguoiNuocNgoai(String hoTen, String gioiTinh, LocalDate ngaySinh, String quocTich, MuiTiem... mt) throws Exception {
        super(hoTen, gioiTinh, ngaySinh, mt);
        this.quocTich = quocTich;
    }

    public NguoiNuocNgoai(String hoTen, String gioiTinh, String ngaySinh, String quocTich, MuiTiem... mt) throws Exception {
        this(
                hoTen,
                gioiTinh,
                LocalDate.parse(ngaySinh, CauHinh.DATE_FORMAT),
                quocTich,
                mt
        );
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Quoc tich: %s\n", this.quocTich); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

}
