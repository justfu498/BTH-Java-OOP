/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai05;

/**
 *
 * @author phana
 */
class NhanVienC extends NhanVien {

    public NhanVienC(String cccd, String hoTen, String queQuan) {
        super(cccd, hoTen, queQuan);
    }

    @Override
    public double getHeSo() {
        return 2.5;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Bo phan: C");
    }

}
