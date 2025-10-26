/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth01;

import java.util.Scanner;

/**
 *
 * @author phana
 */
public class Bai01 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        var sc = new Scanner(System.in);
        int doan;
        do {
            System.out.print("Nhap so ban doan: ");
            doan = sc.nextInt();
            if (doan > n) {
                System.out.println("So ban doan lon hon!");
            } else if (doan < n) {
                System.out.println("So ban doan nho hon!");
            } else {
                System.out.println("Ban doan chinh xac!");
            }
        } while (doan != n);
    }
}