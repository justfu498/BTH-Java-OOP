/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.gamedatbom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author phana
 */
public class QuanLyNhanVat {

    private List<NhanVat> ds = new ArrayList<>();

    public void them(NhanVat... x) {
        this.ds.addAll(Arrays.asList(x));
    }

    public void hienThi() {
        this.ds.forEach(x -> x.hienThi());
    }

    public int demLuotChoi(int id) {
        NhanVat n1 = this.ds.stream().filter(x -> x.getId() == id).findFirst().get();
        if (n1 != null) {
            return n1.demLuotChoi();
        }
        return 0;
    }

    public void sapXep() {
        this.ds.sort(Comparator.comparing(x -> -x.getDsVP().size()));
    }

    public List<NhanVat> getDs() {
        return ds;
    }

    public void setDs(List<NhanVat> ds) {
        this.ds = ds;
    }

}
