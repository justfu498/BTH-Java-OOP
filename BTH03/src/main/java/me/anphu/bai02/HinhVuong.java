/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public String toString() {
        return super.toString().replace("Hinh Chu Nhat", "Hinh Vuong");
    }
}
