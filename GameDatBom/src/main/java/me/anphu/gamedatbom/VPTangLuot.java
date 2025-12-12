/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.gamedatbom;

/**
 *
 * @author phana
 */
public class VPTangLuot extends VatPham {

    private static int dem;

    private int soLuotTang;

    {
        this.id = String.format("A%02d", ++dem);
    }

    public VPTangLuot(int soLuotTang) {
        this.soLuotTang = soLuotTang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So luot tang: %d\n",
                this.soLuotTang);
    }

    public int getSoLuotTang() {
        return soLuotTang;
    }

    public void setSoLuotTang(int soLuotTang) {
        this.soLuotTang = soLuotTang;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int aDem) {
        dem = aDem;
    }

}
