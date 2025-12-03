/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anphu.bai01;

/**
 *
 * @author phana
 */
class Circle extends Ellipse {

    public Circle(double banKinh) {
        super(banKinh, banKinh);
    }

    @Override
    public String toString() {
        return super.toString().replace("Hinh Ellipse", "Hinh Circle");
    }
}
