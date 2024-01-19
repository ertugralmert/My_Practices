package com.mert.examples.methods;

public class DizidePesPeseGelenSayiBulma {
    /**
     * Bir dizide ard arda gelen 2 indexteki sayı değeri 2 ise true yazdırıp döngü sonlandıralım
     * yoksa false yazdıralım
     */

    public static void main(String[] args) {

        int[] sayilar = {2,-256,16,1258,25,2};
        ardArda(sayilar);
        System.out.println(ardArda(sayilar));

    } //main method sonu

    public static boolean ardArda(int ...dizi){
        boolean varMi=false;
        for ( int i = 0 ; i+1<dizi.length; i++){
            if (dizi[i] == 2 && dizi[i+1] ==2 ){
                varMi = true;
                break;
            }
        }
        if (varMi ==true){
            return true;
        }else return false;
    }



} // class sonu
