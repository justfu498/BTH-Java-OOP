/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai02;

/**
 *
 * @author phana
 */
class TamGiacDeu extends TamGiacCan {

    public TamGiacDeu(double abc) throws Exception {
        super(abc, abc);
    }

    @Override
    public String toString() {
        return super.toString().replace("Tam Giac Can", "Tam Giac Deu");
    }
}
