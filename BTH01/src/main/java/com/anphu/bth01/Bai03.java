/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author phana
 */
public class Bai03 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
//        var sc = new Scanner(System.in);
//        String s;
//        int count = 0;
        
//        System.out.print("Nhap s: ");
//        s = sc.nextLine();
//        System.out.println("Ten email la: " + s.substring(0, s.indexOf('@')));
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isUpperCase(s.charAt(i))) {
//                count++;
//            }
//        }
//        System.out.println("So ki tu in hoa: " + count);
        
//        //Doc file
//        File inFile = new File("src/main/resources/input.txt");
//        var scanner = new Scanner(inFile);
//        
//        //Ghi file
//        File outFile = new File("src/main/resources/output.txt");
//        try (FileWriter writer = new FileWriter(outFile)) {
//            while (scanner.hasNext()) {
//                String line = scanner.nextLine();
//                line = line.replaceAll("\\{file\\}", "tap tin");
//                System.out.println(line);
//                writer.write(line + "\n");
//            }
//        }
//        String s = "   Java    is    simple   ";
//        String[] a = s.split(" ");
//        String longestStr = "";
//        for (var x : a) {
//            if (!x.isEmpty()) {
//                count++;
//                if (x.length() > longestStr.length())
//                    longestStr = x;
//            }
//        }
//        System.out.println("So tu: " + count);
//        System.out.println("Tu dai nhat: " + longestStr);
        String s = "   oPeN    uNiveRsiTy    hO   CHi    mINh    ";
        String[] a = s.split(" "); // Tach chuoi de lay tung tu
        String res = "";
        for (var x : a) {
            if (!x.isEmpty()) {
                StringBuilder temp = new StringBuilder(x); // Co the lam cach khac: char[] temp = x.toCharArray();
                //Viet in hoa chu cai dau moi tu
                temp.setCharAt(0, Character.toUpperCase(x.charAt(0)));
                
                //In thuong cac chu cai phia sau
                for (int i = 1; i < x.length(); i++) {
                    temp.setCharAt(i, Character.toLowerCase(x.charAt(i)));
                }
                
                //Ghep tu da chuan hoa
                res = res + temp.toString() + " ";
            }
        }
        // Xoa ki tu khoang trang o cuoi
        res = res.trim();
        System.out.println("Ket qua: " + res);
    }
}