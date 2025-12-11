/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

/**
 *
 * @author phana
 */
class TKKoKyHan extends TaiKhoan {

    public TKKoKyHan(String tenTK, double soTien) {
        super(tenTK, soTien);
    }

    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhLai() {
        return this.getSoTien() * (0.1 / 100);
    }
}
