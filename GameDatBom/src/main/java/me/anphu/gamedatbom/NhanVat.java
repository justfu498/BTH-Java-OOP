/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.gamedatbom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author phana
 */
public class NhanVat {

    private static int dem;

    private int id = ++dem;
    private String ten;
    private List<VatPham> dsVP = new ArrayList<>();

    public NhanVat(String ten) {
        this.ten = ten;
    }

    public void themVP(VatPham... x) {
        this.dsVP.addAll(Arrays.asList(x));
    }

    public void hienThi() {
        System.out.printf("%d - %s\n",
                this.id, this.ten);
        if (this.dsVP != null) {
            System.out.println("Danh sach vat pham:");
            this.dsVP.forEach(x -> x.hienThi());
        }
    }

    public int demLuotChoi() {
        return this.dsVP.stream()
                .filter(x -> x instanceof VPTangLuot)
                .flatMapToInt(x -> IntStream.of(((VPTangLuot) x).getSoLuotTang()))
                .sum();
//        int d = 0;
//        for (var x : dsVP) {
//            if (x instanceof VPTangLuot vPTangLuot) {
//                d += vPTangLuot.getSoLuotTang();
//            }
//        }
//        return d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<VatPham> getDsVP() {
        return dsVP;
    }

    public void setDsVP(List<VatPham> dsVP) {
        this.dsVP = dsVP;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

}
