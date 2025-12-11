/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author phana
 */
class QLNguoi {

    private List<Nguoi> ds = new ArrayList<>();

    public void them(Nguoi... n) {
        this.ds.addAll(Arrays.asList(n));
    }

    public void hienThi() {
        System.out.println("===DANH SACH NGUOI THAM GIA TIEM CHUNG===");
        this.ds.forEach(x -> System.out.println(x));
    }

    public List<Nguoi> timKiem(String tenLop) throws ClassNotFoundException {
        Class c = Class.forName(tenLop);
        return this.ds.stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
    }

    public List<Nguoi> getQl() {
        return ds;
    }

    public void setQl(List<Nguoi> ds) {
        this.ds = ds;
    }

}
