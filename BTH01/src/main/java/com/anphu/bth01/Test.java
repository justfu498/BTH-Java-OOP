/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phana
 */
class KhachHang {

    private String username;
    private String password;

    public KhachHang() {
    }

    public KhachHang(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Sach {

    private String author;
    private String title;
    private double cost;

    public Sach() {
    }

    public Sach(String author, String title, double cost) {
        this.author = author;
        this.title = title;
        this.cost = cost;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void print() {
        System.out.printf("%s - %s - %.0f", author, title, cost);
        System.out.println();
    }
}

class DSKH {

    private List<KhachHang> accountList;
    private File accountFile;

    public DSKH() throws FileNotFoundException {
        accountList = new ArrayList<>();
        accountFile = new File("src/main/resources/AccountList");
        try (Scanner sc = new Scanner(accountFile)) {
            while (sc.hasNext()) {
                KhachHang kh = new KhachHang();
                kh.setUsername(sc.next());
                kh.setPassword(sc.next());
                accountList.add(kh);
            }
        }
    }

    public void addAccount(KhachHang kh) throws FileNotFoundException, IOException {
        accountList.add(kh);
        FileWriter fw = new FileWriter(accountFile, true);
        try (PrintWriter pw = new PrintWriter(fw)) {
            pw.println(kh.getUsername());
            pw.println(kh.getPassword());
        }
    }

    public KhachHang findAccountByName(String username) {
        return accountList.stream().filter(x -> x.getUsername().equals(username)).findFirst().orElse(null);
    }
}

class DSSach {

    private List<Sach> bookList;
    private File bookFile;

    public DSSach() throws FileNotFoundException {
        bookList = new ArrayList<>();
        bookFile = new File("src/main/resources/AvailableBook.txt");
        try (Scanner sc = new Scanner(bookFile)) {
            while (sc.hasNext()) {
                Sach s = new Sach();
                String info = sc.nextLine();
                String[] a = info.split(":");
                s.setAuthor(a[0]);
                s.setTitle(a[1]);
                s.setCost(Double.parseDouble(a[2]));
                bookList.add(s);
            }
        }
    }

    public List<Sach> getBookList() {
        return bookList;
    }

    public Sach findBook(String title) {
        return bookList.stream().filter(x -> x.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
}

public class Test {

    public static KhachHang dangKy() throws FileNotFoundException, IOException {
        DSKH accountList = new DSKH();
        Scanner sc = new Scanner(System.in);
        String usname;
        do {
            System.out.print("Ten dang nhap: ");
            usname = sc.next();
            //Neu bi trung ten dang nhap
            if (accountList.findAccountByName(usname) != null) {
                System.out.println("Ten dang nhap bi trung! Nhap ten khac di!");
            } else {
                break;
            }
        } while (true);

        String password;
        do {
            System.out.print("Mat khau: ");
            password = sc.next();
            if (password.length() < 8) {
                System.out.println("Mat khau phai co it nhat 8 ki tu tro len!");
            }
        } while (password.length() < 8);
        System.out.println("Ban da dang ky thanh cong!");

        KhachHang kh = new KhachHang(usname, password);
        accountList.addAccount(kh);

        return kh;
    }

    public static KhachHang dangNhap() throws IOException {
        DSKH accountList = new DSKH();
        Scanner sc = new Scanner(System.in);
        String usname;
        KhachHang kh = null;
        do {
            System.out.print("Ten dang nhap: ");
            usname = sc.next();
            kh = accountList.findAccountByName(usname);
            if (kh == null) {
                System.out.println("Khong tim thay ten dang nhap!");
                System.out.println("Ban co muon:");
                System.out.print("1. Nhap lai");
                System.out.print("2. Dang ky tai khoan");
                System.out.print("Nhap lua chon: ");
                int chon = Integer.parseInt(sc.next());
                if (chon == 2) {
                    return dangKy();
                }
            } else {
                break;
            }
        } while (true);

        String pw;
        do {
            System.out.print("Mat khau: ");
            pw = sc.next();
            if (pw.equals(kh.getPassword())) {
                break;
            } else {
                System.out.println("Sai mat khau! Nhap lai!");
            }
        } while (true);

        System.out.println("Ban da dang nhap thanh cong!");
        return kh;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        System.out.println("=====CUA HANG SACH TAI LE=====");
//        System.out.println("Ban da co tai khoan chua?");
//        System.out.println("1. Co");
//        System.out.println("0. Khong");
//        System.out.print("Nhap lua chon: ");
//        KhachHang kh;
//        int chon = (Integer.parseInt(sc.next()));
//        if (chon == 0) {
//            kh = dangKy();
//        } else {
//            kh = dangNhap();
//        }
//        System.out.println("======================================");

        DSSach dsSach = new DSSach();
        List<Sach> gioHang = new ArrayList<>();

        int chon;
        do {
//            System.out.println("Cua hang sach TAILE xin chao " + kh.getUsername());
            System.out.println("1. Xem va chon sach");
            System.out.println("2. Vao gio hang");
            System.out.println("3. Dang xuat");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.next());
            System.out.println("======================================");
            switch (chon) {
                case 1 -> {
                    System.out.println("XEM VA CHON SACH");
                    
                    for (Sach x : dsSach.getBookList()) {
                        x.print();
                    }
                    sc.nextLine();
                    
                    Sach sach;
                    String title;

                    do {
                        System.out.print("Nhap ten sach can chon: ");
                        title = sc.nextLine();
                        sach = dsSach.findBook(title);
                        if (sach != null) {
                            System.out.println("Da them sach vao gio hang!");
                            gioHang.add(sach);
                            break;
                        } else {
                            System.out.println("Khong tim thay sach! Nhap lai!");
                        }
                    } while (true);
                }
                case 2 -> {
                    System.out.println("Vao gio hang");
                    if (gioHang.isEmpty()) {
                        System.out.println("Ban chua them bat ki sach nao vao gio hang!");
                        break;
                    }
                    System.out.printf("Ban da them vao gio hang %d sach:\n", gioHang.size());
                    for (var x : gioHang) {
                        x.print();
                    }
                    System.out.println("Ban co muon thanh toan?");
                    System.out.println("1. Co");
                    System.out.println("0. Khong");
                    System.out.print("Nhap lua chon: ");
                    if (Integer.parseInt(sc.next()) == 1) {
                        File bill = new File("src/main/resources/bill.txt");
                        try (PrintWriter pw = new PrintWriter(bill)) {
                            pw.println("           TAILE BOOKSTORE");
                            pw.println("=====================================\n");
                            pw.println("Cac loai sach: ");
                            double tongHD = 0;
                            for (var x : gioHang) {
                                tongHD += x.getCost();
                                pw.printf(" - %s - %s: %.0f", x.getAuthor(), x.getTitle(), x.getCost());
                                pw.println("");
                            }
                            pw.println();
                            pw.println("Tong hoa don: " + tongHD);
                            pw.println();
                            pw.print("Cam on quy khach da ung ho shop <3");
                        }
                        gioHang.clear();
                    }
                }
                case 3 ->
                    System.out.println("Dang xuat");
                case 0 ->
                    System.out.println("Thoat chuong trinh");
                default ->
                    System.out.println("Lua chon ko hop le!");
            }
        } while (chon != 0);
    }
}
