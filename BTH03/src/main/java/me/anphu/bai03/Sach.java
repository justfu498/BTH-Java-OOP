package me.anphu.bai03;

class Sach extends SanPham {

    private int soTrang;

    public Sach(String ten, double gia, int soStrang) {
        super(ten, gia);
        this.soTrang = soStrang;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("So trang: %d\n", this.soTrang);
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

}
