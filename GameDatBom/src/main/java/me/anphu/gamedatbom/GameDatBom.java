/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.anphu.gamedatbom;

/**
 *
 * @author phana
 */
public class GameDatBom {

    public static void main(String[] args) {
        NhanVat n1 = new NhanVat("Traveller");
        NhanVat n2 = new NhanVat("Kamisato Ayaka");
        NhanVat n3 = new NhanVat("Raiden Shogun");
        QuanLyNhanVat ql = new QuanLyNhanVat();
        ql.them(n1, n2, n3);
        ql.hienThi();
        System.out.println("===");
        VatPham v1 = new VPTangLuot(5);
        VatPham v2 = new VPTangMau(3);
        VatPham v3 = new VPTangLuot(7);
        n1.themVP(v1, v3);
        n2.themVP(v2);
        n3.themVP(v1, v2, v3);
        ql.hienThi();
        System.out.println("===");
        System.out.println(n1.demLuotChoi());
        System.out.println(n2.demLuotChoi());
        System.out.println("===");
        ql.sapXep();
        ql.hienThi();
    }
}
