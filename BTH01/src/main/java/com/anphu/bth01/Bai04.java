/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.bth01;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author phana
 */
public class Bai04 {

    public static int[] inputArr(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void outputArr(int[] a) {
        for (var x : a) {
            System.out.printf("%d\t", x);
        }
        System.out.println("");
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] sortPrime(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (isPrime(a[i])) {
                int minPos = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (isPrime(a[j]) && a[minPos] > a[j]) {
                        minPos = j;
                    }
                }
                int x = a[i];
                a[i] = a[minPos];
                a[minPos] = x;
            }
        }
        return a;
    }
    
    public static int search(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == key) 
                return mid;
            else if (a[mid] > key)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, -4, 3, -9, 8, 2};
        outputArr(a);
        int sum = IntStream.of(a).filter(x -> isPrime(x)).sum();
        System.out.println("Tong so nguyen to: " + sum);

        int max = IntStream.of(a).filter(x -> x > 0).max().orElse(0);
        int min = IntStream.of(a).filter(x -> x < 0).min().orElse(0);
        System.out.println("So nguyen duong lon nhat: " + (max != 0 ? max : "*"));
        System.out.println("So nguyen am be nhat: " + (min != 0 ? min : "*"));

        min = IntStream.of(a).filter(x -> isPrime(x)).min().orElse(0);
        System.out.println("So nguyen to nho nhat: " + (min != 0 ? min : "*"));

        int[] res = sortPrime(a);
        outputArr(res);
        
        System.out.println(search(a, 7));
    }
}
