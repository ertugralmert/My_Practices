package com.mert.myexamples.methods;

public class MultiArrayAyirmaTekSayilarıBulma {

    // method veya methodlar kullanarak arraydeki tek sayıları başka bir tek boyutlu array'de toplamını bulun

    public static void main(String[] args) {

        System.out.println("Program Started");

        int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
                { 189, 35, 56, 89, 8 } };

        System.out.println("Multi Array Dizisindeki Tek Sayıların Toplamı->>> " + diziAyiripTekSayilarıToplama(matris));
        // Multi Array Dizisindeki Tek Sayıların Toplamı->>> 693

        System.out.println("Program Finished");

       // System.out.println(matris[3][4]); // ->> 8



    } // main method sonu

    public static int diziAyiripTekSayilarıToplama(int[][] dizi){
        int toplam =0;
        for ( int i = 0 ; i< dizi.length; i++){
            for ( int j = 0; j < dizi[i].length ; j++){
                if (dizi[i][j] % 2 == 1){
                    toplam += dizi[i][j];
                }
            }
        } return toplam;
    }


} // class sonu

