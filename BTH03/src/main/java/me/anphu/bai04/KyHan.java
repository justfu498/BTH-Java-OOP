/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

import java.time.LocalDate;

/**
 *
 * @author phana
 */
enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
            return from.plusDays(this.khoangTG);
        }

        @Override
        public double tinhLai(double soTien) {
            // (Tien lai 1 nam) / (so tuan trong 1 nam) = tien lai trong 1 tuan
            return (soTien * (this.laiSuat / 100)) / (12 * 4);
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
            return from.plusMonths(this.khoangTG);
        }

        @Override
        public double tinhLai(double soTien) {
            // (Tien lai 1 nam) / (12 thang) = tien lai trong 1 thang
            return (soTien * (this.laiSuat / 100)) / 12;
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate tinhDaoHan(LocalDate from) {
            return from.plusYears(this.khoangTG);
        }

        @Override
        public double tinhLai(double soTien) {
            return soTien * (this.laiSuat / 100);
        }
    };

    protected int khoangTG;
    protected double laiSuat;

    private KyHan(int khoangTG, double laiSuat) {
        this.khoangTG = khoangTG;
        this.laiSuat = laiSuat;
    }

    public abstract LocalDate tinhDaoHan(LocalDate from);

    public abstract double tinhLai(double soTien);
}
