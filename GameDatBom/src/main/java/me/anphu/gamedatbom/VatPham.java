/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.gamedatbom;

/**
 *
 * @author phana
 */
public abstract class VatPham {

    protected String id;

    public String getId() {
        return id;
    }

    public void hienThi() {
        System.out.printf("Ma VP: %s\n",
                this.id);
    }
}
