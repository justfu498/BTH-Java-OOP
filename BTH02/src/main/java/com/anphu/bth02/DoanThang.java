/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth02;

/**
 *
 * @author phana
 */
public class DoanThang {
    private Diem diemDau;
    private Diem diemCuoi;
    
    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }
    
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }
    
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
    
    public Diem getDiemDau() {
        return diemDau;
    }
    
    public Diem getDiemCuoi() {
        return diemCuoi;
    }
    
    public void hienThi() {
        System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]", 
                this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }
    
    public double tinhDoDai() {
        return this.diemDau.tinhKhoangCach(this.diemCuoi);
    }
    
    public Diem timTrungDiem() {
        double x = (this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo()) / 2;
        double y = (this.diemDau.getTungDo() + this.diemCuoi.getTungDo()) / 2;
        return new Diem(x, y);
    }
    
    public boolean isSongSong(DoanThang dt) {
        // (xA - xB)(yC-yD) = (xC-xD)(yA-yB)
        double veTrai = 
                (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) *
                (dt.getDiemDau().getTungDo() - dt.getDiemCuoi().getTungDo());
        double vePhai =
                (dt.getDiemDau().getHoanhDo() - dt.getDiemCuoi().getHoanhDo()) *
                (this.getDiemDau().getTungDo() - this.getDiemCuoi().getTungDo());
        return Double.compare(veTrai, vePhai) == 0;
    }
}
