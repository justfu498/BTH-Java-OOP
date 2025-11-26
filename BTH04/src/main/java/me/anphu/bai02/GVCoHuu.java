package me.anphu.bai02;

class GVCoHuu extends GiangVien {

    private double luongCB;
    private double heSo;

    public GVCoHuu(String hoTen, String ngayTG, double gioLam, double luongCB, double heSo) {
        super(hoTen, ngayTG, gioLam);
        this.luongCB = luongCB;
        this.heSo = heSo;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Luong CB: %.2f\nHe so: %.2f\nLuong: %.1f\n",
                        this.luongCB, this.heSo, this.tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return getGioLam() * LUONG_MOT_GIO + this.luongCB * this.heSo;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

}
