package com.mert.myexamples.methods;

public class ArrayMaxMin {

    // bir dizideki max, min, ve en büyük ikinci değeri bulalım.


    public static void main(String[] args) {
        System.out.println("Program Started");

        int[] sayilar = {5,1123,-10,32,2342,2,324,454242,-349934}; // -> örnek dizi
        System.out.println("Dizideki En Büyük Sayı ->>>> " + dizidekiEnbuyukSayiyiBulma(sayilar));
        System.out.println("Dizideki En Küçük Sayı ->>>> " + dizidekiEnKucukSayiyiBulma(sayilar));
        System.out.println("Dizideki En Buyuk İkinci Sayı ->>> " +dizidekiEnBuyukIkinciSayiyiBulma(sayilar));


        System.out.println("Program Finished");

    } // main method sonu

    public static int dizidekiEnbuyukSayiyiBulma(int ...dizi){
        int enBuyukSayi = Integer.MIN_VALUE;
        for (int i = 0; i<dizi.length; i++){

            if (dizi[i] > enBuyukSayi){
                enBuyukSayi = dizi[i];
            }
        } return enBuyukSayi;
    }

    public  static  int dizidekiEnKucukSayiyiBulma(int ...dizi){
        int enKucukSayi = Integer.MAX_VALUE;
        for ( int i = 0; i < dizi.length; i++){
            if (dizi[i] < enKucukSayi){
                enKucukSayi = dizi[i];
            }
        } return enKucukSayi;
    }

    public static int dizidekiEnBuyukIkinciSayiyiBulma(int ...dizi){
        int enBuyukIkinciSayi = Integer.MIN_VALUE;

        for ( int i = 0; i< dizi.length; i++){
            if (dizi[i]==dizidekiEnbuyukSayiyiBulma(dizi)){
                continue;
            }else if (dizi[i]> enBuyukIkinciSayi){
                enBuyukIkinciSayi = dizi[i];
            }
        } return  enBuyukIkinciSayi;
    }

} // class sonu
