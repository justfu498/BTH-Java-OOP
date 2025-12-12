/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.gamedatbom;

/**
 *
 * @author phana
 */
public class VPTangMau extends VatPham {

    private static int dem;

    private int soMauTang;

    {
        this.id = String.format("B%02d", ++dem);
    }

    public VPTangMau(int soMauTang) {
        this.soMauTang = soMauTang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So mau tang: %d\n",
                this.soMauTang);
    }

    public int getSoMauTang() {
        return soMauTang;
    }

    public void setSoMauTang(int soMauTang) {
        this.soMauTang = soMauTang;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

}
