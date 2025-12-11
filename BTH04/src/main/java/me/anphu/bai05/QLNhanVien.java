/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phana
 */
class QLNhanVien {

    private List<NhanVien> ds = new ArrayList<>();

    public void them(NhanVien... x) {
        this.ds.addAll(Arrays.asList(x));
    }

    public void xoa(NhanVien x) {
        this.ds.remove(x);
    }

    public void hienThi() {
        this.ds.forEach(x -> {
            x.hienThi();
            System.out.println("");
        });
    }

    public List<NhanVien> getDs() {
        return ds;
    }

    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

}
