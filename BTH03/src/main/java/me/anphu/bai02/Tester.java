/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class Tester {

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(3, 4);
        System.out.println(hcn);
        HinhChuNhat hv = new HinhVuong(3);
        System.out.println(hv);

        try {
            TamGiac t1 = new TamGiac(1, 3, 1);
            System.out.println(t1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            TamGiac t2 = new TamGiac(3, 2, 4);
            System.out.println(t2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            TamGiac t3 = new TamGiacCan(3, 2);
            System.out.println(t3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            TamGiac t4 = new TamGiacDeu(3);
            System.out.println(t4);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
