/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author phana
 */
class QLVacxin {

    private List<Vacxin> ds = new ArrayList<>();

    public void them(Vacxin... x) {
        this.ds.addAll(Arrays.asList(x));
    }

    public void hienThi() {
        System.out.println("===DANH SACH VACXIN===");
        this.ds.forEach(x -> System.out.println(x));
    }

    public void sapXep() {
        this.ds.sort(Comparator.comparing(Vacxin::getXuatXu));
    }

    public List<Vacxin> getDs() {
        return ds;
    }

    public void setDs(List<Vacxin> ds) {
        this.ds = ds;
    }

}
