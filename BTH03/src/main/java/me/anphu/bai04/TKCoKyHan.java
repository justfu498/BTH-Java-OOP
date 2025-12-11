/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author phana
 */
class TKCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TKCoKyHan(String tenTK, double soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %s\nNgay dao han: %s\n",
                this.kyHan, this.ngayDaoHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.isEqual(LocalDate.now());
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.getSoTien());
    }

    public void capNhatDaoHan() {
        if (this.ngayDaoHan.isEqual(LocalDate.now())) {
            this.ngayDaoHan = this.kyHan.tinhDaoHan(LocalDate.now());
        }
    }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

}
