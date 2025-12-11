/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author phana
 */
class QLTK {

    private List<TaiKhoan> ds = new ArrayList<>();

    public void them(TaiKhoan... t) {
        this.ds.addAll(Arrays.asList(t));
    }

    public void hienThi() {
        this.ds.forEach(t -> t.hienThi());
    }

    public List<TaiKhoan> timKiem(String str) {
        try {
            Integer.valueOf(str);
            return this.ds.stream().filter(x -> x.getSoTK().equals(str)).collect(Collectors.toList());
        } catch (NumberFormatException ex) {
            return this.ds.stream().filter(x -> x.getTenTK().contains(str)).collect(Collectors.toList());
        }
    }

    public void hienThiLs() {
        this.ds.forEach(x -> System.out.println(x.tinhLai()));
    }

    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }

}
