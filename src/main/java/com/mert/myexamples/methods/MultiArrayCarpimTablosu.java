package com.mert.myexamples.methods;

import java.util.Scanner;

public class MultiArrayCarpimTablosu {

    // 1 ile 10 arasındaki sayıların çarpım tablosunu mutli bir arrayde toplayalım.

    public static void main(String[] args) {
        System.out.println("Program Started");

        carpimTablosuOlusturma();

    } // main method sonu

    public static void carpimTablosuOlusturma(){
        System.out.println("Oluşturmak istediğiniz multi array çarpım tablosu sayısını giriniz: ");
        int sayi = new Scanner(System.in).nextInt();
        int[][] dizi = new int[sayi][sayi];
        for ( int i = 0 ; i<dizi.length; i++){
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.println( (i+1) + " x " + (j+1) + " = " + (i+1) * (j+1));
            }
        }
    }
} // class sonu
