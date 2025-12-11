/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author phana
 */
abstract class Nguoi {

    private String hoTen;
    private String gioiTinh;
    private LocalDate ngaySinh;
    private List<MuiTiem> dsMuiTiem = new ArrayList<>();

    public Nguoi(String hoTen, String gioiTinh, LocalDate ngaySinh, MuiTiem... muiTiem) throws Exception {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        if (LocalDate.now().getYear() - ngaySinh.getYear() >= 18) {
            this.ngaySinh = ngaySinh;
        } else {
            throw new Exception(hoTen + " chua du 18 tuoi de tiem!");
        }
        if (muiTiem.length <= 3) {
            this.dsMuiTiem.addAll(Arrays.asList(muiTiem));
        } else {
            throw new Exception("So mui tiem cua " + hoTen + " khong hop le!");
        }
    }

    public Nguoi(String hoTen, String gioiTinh, String ngaySinh, MuiTiem... muiTiem) throws Exception {
        this(hoTen, gioiTinh, LocalDate.parse(ngaySinh, CauHinh.DATE_FORMAT), muiTiem);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Ho ten: %s\nGioi tinh: %s\nNgay sinh: %s\n",
                this.hoTen, this.gioiTinh, this.ngaySinh.format(CauHinh.DATE_FORMAT))
        );

        if (!this.dsMuiTiem.isEmpty()) {
            sb.append("Danh sach mui tiem: ");
            String kq = this.dsMuiTiem.stream().map(x -> x.getLoaiVacxin().getTen()).collect(Collectors.joining(", "));
            sb.append(kq).append("\n");
        }

        return sb.toString();
    }

    public void themMuiTiem(MuiTiem muiTiem) throws Exception {

        if (this.dsMuiTiem.isEmpty()) {
            this.dsMuiTiem.add(muiTiem);
        } else if (this.dsMuiTiem.size() < 3 && this.dsMuiTiem.getLast().isDuDK(muiTiem)) {
            this.dsMuiTiem.add(muiTiem);
        } else {
            throw new Exception(this.hoTen + " khong du dieu kien de tiem!");
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public List<MuiTiem> getDsMuiTiem() {
        return dsMuiTiem;
    }

    public void setDsMuiTiem(List<MuiTiem> dsMuiTiem) throws Exception {
        if (dsMuiTiem.size() <= 3) {
            this.dsMuiTiem = dsMuiTiem;
        } else {
            throw new Exception("So mui tiem cua " + hoTen + " khong hop le!");
        }
    }

}
