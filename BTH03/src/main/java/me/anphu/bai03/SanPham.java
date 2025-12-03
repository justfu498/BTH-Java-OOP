package me.anphu.bai03;

abstract class SanPham {

    private static int dem;

    private int id = ++dem;
    private String ten;
    private double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nTen: %s\nGia: %.1f\n",
                this.id, this.ten, this.gia);
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
