package me.anphu.bai02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class QLGV {

    private List<GiangVien> ds = new ArrayList<>();

    public void hienThi() {
        this.ds.forEach(x -> System.out.println(x));
    }

    public void them(GiangVien... gv) {
        this.getDs().addAll(Arrays.asList(gv));
    }

    public void xoa(GiangVien gv) {
        this.getDs().remove(gv);
    }

    public List<GiangVien> timKiem(String kw) {
        return this.getDs().stream().filter(x -> x.getHoTen().contains(kw)).collect(Collectors.toList());
    }

    public void sapXep() {
        this.getDs().sort(Comparator.comparing(GiangVien::tinhLuong, Collections.reverseOrder()));
    }

    public List<GiangVien> getDs() {
        return ds;
    }

    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }

}
