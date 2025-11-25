/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author phana
 */
class QLHinh {

    private List<Hinh> ds = new ArrayList<>();

    public void them(Hinh... h) {
        this.ds.addAll(Arrays.asList(h));
    }

    public void xoa(String ten) {
        List<Hinh> dsXoa = this.ds.stream().filter(x -> x.getTen().equals(ten)).collect(Collectors.toList());
        this.ds.removeAll(dsXoa);
    }

    public void hienThi() {
        this.ds.forEach(x -> System.out.println(x));
    }

    public List<Hinh> timKiem(String tenLop) throws ClassNotFoundException {
        Class c = Class.forName(tenLop);
        return this.ds.stream().filter(x -> x.getClass().equals(c)).collect(Collectors.toList());
    }

    public void sapXep1() {
        this.ds.sort(Comparator.comparing(Hinh::tinhDienTich, Collections.reverseOrder()));
    }

    public void sapXep2() {
        this.ds.sort(Comparator.comparing(Hinh::getTen).thenComparing(Hinh::tinhDienTich, Collections.reverseOrder()));
    }

    public double tinhDTTB() {
        double sum = 0;
        for (var x : this.ds) {
            sum += x.tinhDienTich();
        }
        return sum / this.ds.size();
    }

    public int timHinh(Hinh h) {
        return this.ds.indexOf(h);
    }

    public List<Hinh> getDs() {
        return ds;
    }

    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }

}
