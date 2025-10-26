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
public class Bai02 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int n, x, sum = 0;
        
        System.out.print("Nhap bac da thuc: ");
        n = sc.nextInt();
        
        System.out.print("Nhap tham so x: ");
        x = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.printf("Nhap a%d: ", i);
            int a = sc.nextInt();
            sum += a * Math.pow(x, i);
        }
        
        System.out.printf("Ket qua: f(%d) = %d", x, sum);
    }
}
