/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class TamGiacCan extends TamGiac {

    public TamGiacCan(double ab, double c) throws Exception {
        super(ab, ab, c);
    }

    @Override
    public String toString() {
        return super.toString().replace("Hinh Tam Giac", "Tam Giac Cab");
    }
}
