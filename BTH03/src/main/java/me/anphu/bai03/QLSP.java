package me.anphu.bai03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class QLSP {

    private List<SanPham> ds = new ArrayList<>();

    public void them(SanPham... sp) {
        this.getDs().addAll(Arrays.asList(sp));
    }

    public void xoa(SanPham sp) {
        this.getDs().remove(sp);
    }

    public void xoa(int id) {
        SanPham x = timKiem(id);
        if (x != null) {
            this.ds.remove(x);
        }
    }

    public void hienThi() {
        this.getDs().forEach(x -> System.out.println(x));
    }

    public List<SanPham> timKiem(String str) {
        try {
            Class c = Class.forName(str);
            return this.getDs().stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.getDs().stream().filter(x -> x.getTen().contains(str)).collect(Collectors.toList());
        }
    }

    public SanPham timKiem(int id) {
        return this.ds.stream().filter(x -> x.getId() == id).findFirst().get();
    }

    public List<SanPham> timKiem(double giaDau, double giaCuoi) {
        return this.ds.stream().filter(x -> x.getGia() >= giaDau && x.getGia() <= giaCuoi).collect(Collectors.toList());
    }

    public void sapXep() {
        this.getDs().sort(Comparator.comparing(SanPham::getGia, Collections.reverseOrder()));
    }

    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
