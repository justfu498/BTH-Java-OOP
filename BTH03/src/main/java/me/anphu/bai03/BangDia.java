package me.anphu.bai03;

class BangDia extends SanPham {

    private double doDai;

    public BangDia(String ten, double gia, double doDai) {
        super(ten, gia);
        this.doDai = doDai;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Do dai: %.1f\n", this.doDai);
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

}
