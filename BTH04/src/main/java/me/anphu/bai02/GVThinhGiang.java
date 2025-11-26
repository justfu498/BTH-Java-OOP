package me.anphu.bai02;

class GVThinhGiang extends GiangVien {

    private String noiCongTac;

    public GVThinhGiang(String hoTen, String ngayTG, double gioLam, String noiCongTac) {
        super(hoTen, ngayTG, gioLam);
        this.noiCongTac = noiCongTac;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Noi cong tac: %s\nLuong: %.1f\n",
                        this.noiCongTac, this.tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return getGioLam() * LUONG_MOT_GIO;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

}
